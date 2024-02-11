package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import com.smart.helper.Messages;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","Home-Smart Contact Manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","About Page");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("user",new User());
		model.addAttribute("title","Signup Page");
		return "signup";
	}
	
	//this is handler for registering user
	
	@PostMapping("/do_register")
	public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result1 ,@RequestParam(value="agreement",defaultValue = "false")
								boolean agreement,Model model,HttpSession session)
	{
		try 
		{
			if(!agreement)
			{
				session.setAttribute("message", new Messages("You Have Not Agreed to Terms And Conditions","alert-danger"));

				System.out.println("You have not agreed to the terms and conditions");
				throw new Exception("You have not agreed to the terms and conditions");
			}
			
			if(result1.hasErrors())
			{
				System.out.println("ERROR"+result1.toString());
				model.addAttribute("user",user);
				return "signup";
			}
			
			user.setRole("USER");
			user.setEnabled(true);
			user.setImageurl("default.png");
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			User result = this.userRepository.save(user);
			
			System.out.println("agreement "+agreement);
			System.out.println("user"+user);
			
			model.addAttribute("user",new User());
			session.setAttribute("message", new Messages("Succesfully Registered","alert-success"));
			return "signup";
			
		} catch (Exception e)
		{
			e.printStackTrace();
			model.addAttribute("user",user);
			session.setAttribute("message", new Messages("Something Went Wrong !!"+e.getMessage(),"alert-danger"));
			
			return "signup";
		}
		
		
	}

	//this is handler for login handler
	
	@GetMapping("/signin")
	public String customLogin(Model model)
	{
		model.addAttribute("title", "Login Page");
		return "Login";
	}
}


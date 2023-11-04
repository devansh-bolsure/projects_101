package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

@Controller
//@RequestMapping("/first")
public class HomeController 
{
	@RequestMapping(value="/home")
	public String home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("name", "Akash");
		model.addAttribute("id", 12345);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Abhishek");
		friends.add("Krushna");
		friends.add("Tejas");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping(value="about")
	public String about()
	{
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help url");
		
		//creating modelAndView object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting Data
		modelAndView.addObject("name","Zoro");
		modelAndView.addObject("id",666);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(476);
		numbers.add(9862);
		numbers.add(923);
		modelAndView.addObject("numbers",numbers);
//		setting view name(was working fine without it)
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
	
	
	
	
	
}

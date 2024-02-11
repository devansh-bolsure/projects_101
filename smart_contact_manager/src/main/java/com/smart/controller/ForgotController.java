package com.smart.controller;

import java.util.Random;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ForgotController 
{
	Random random=new Random(1000);
	
	//email id form open handler
	
	@GetMapping("/forgot")
	public String openEmailForm()
	{
		return "forgot_email_form";
	}
	
	//sending otp handler
	
	@PostMapping("/send-otp")
	public String sendOTP(@RequestParam("email") String email)
	{
		System.out.println("Email: "+email);
		
		//generating 4 digit otp
		int otp = this.random.nextInt(999999);
		
		System.out.println("OTP "+otp);
		
		return "verify_otp";
	}
	

}

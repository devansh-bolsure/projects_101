package com.springboot.RestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.RestApi.helper.FileUploadHelper;

import jakarta.servlet.Servlet;

@RestController
public class FileUploadController 
{
	@Autowired
	FileUploadHelper fileUploadhelper;
	
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> UploadFile(@RequestParam("file") MultipartFile file)
	{
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getContentType());
//		System.out.println(file.getSize());
//		System.out.println(file.getName());
		try
		{
			//validation 
			if(file.isEmpty()) 
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contail a file");
			}
			
			if(!file.getContentType().equals("image/jpeg"))
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpeg content type file is allowed");
	
			}
			
			//file upload code...
			
			Boolean f = fileUploadhelper.uploadFile(file);
			
			if(f)
			{
//				return ResponseEntity.ok("FIle is Succesfully Uploaded");
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong! try again");
	}

}

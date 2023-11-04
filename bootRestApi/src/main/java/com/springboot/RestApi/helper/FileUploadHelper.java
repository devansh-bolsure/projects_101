package com.springboot.RestApi.helper;

import java.io.File;
import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper 
{
//	public final String Upload_Dir="C:\\Users\\DEVANSH BOLSURE\\Dropbox\\My PC (LAPTOP-9PET8DJR)\\Documents\\Spring_projects\\bootRestApi\\src\\main\\resources\\static\\images";
	
	public final String Upload_Dir=new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException
	{
		
	}
	
	public Boolean uploadFile(MultipartFile multipartFile)
	{
		Boolean f=false;
		try
		{
//			//reading file
//			InputStream is=multipartFile.getInputStream();
//			byte[] data=new byte[is.available()];
//			is.read(data);
//			
//			//writing file
//			
//			FileOutputStream fos=new FileOutputStream(Upload_Dir+File.separator+multipartFile.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			fos.close();
			
			Files.copy(multipartFile.getInputStream(), Paths.get(Upload_Dir+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			
			f=true;
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return f;
		
	}
}



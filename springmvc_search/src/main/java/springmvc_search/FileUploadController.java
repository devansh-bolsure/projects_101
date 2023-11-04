package springmvc_search;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
//import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;


@Controller
public class FileUploadController 
{
	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		System.out.println("This is showUploadForm handler");
		String str=null;
		System.out.println(str.length());
		return "fileForm";
	}
	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile") MultipartFile  file, HttpSession s,Model model)
	{
		System.out.println("This is fileupload handler");

		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getResource());
		
		//we have to save this file to the server
		
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator
						+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		model.addAttribute("msg","uploaded succesfully");
		model.addAttribute("filename",file.getOriginalFilename());
		
		try
		{
			byte[] data=file.getBytes();
			FileOutputStream fos= new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("uploading error");
			model.addAttribute("msg","uploading error");
		}
		
		return "fileSuccess";
	}
	
}

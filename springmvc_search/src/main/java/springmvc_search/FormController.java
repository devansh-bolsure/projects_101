package springmvc_search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc_search_Entity.Student;

@Controller
public class FormController 
{
	@RequestMapping("/complex")
	public String showform()
	{
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("Student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return"success";
	}
}

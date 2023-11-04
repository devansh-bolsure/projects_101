package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController 
{	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model)
	{
		model.addAttribute("Header1","Registration Form Header");
		System.out.println("This is common data for model");
	}
	
	
	@RequestMapping("/contact")
	public String showform(Model model)
	{
		System.out.println("This is contact url");
		return"contact";
	}
	
	@RequestMapping(path="/form",method = RequestMethod.POST)
	public String formHandler(@ModelAttribute User user,
							  Model model)
	{
		System.out.println("This is form url");
		this.userService.createUser(user);
		
		return "success";
	}
	
}



/* -->This is the code for accessing data from view with creating a seperate User class for parameters
@RequestMapping(path="/form",method = RequestMethod.POST)
public String formHandler(@RequestParam("useremail") String email,
						  @RequestParam("username") String name,
						  @RequestParam("userpassword") String password,
						  Model model)
{
	System.out.println("This is form url");
	
	User user=new User();
	user.setUseremail(email);
	user.setUsername(name);
	user.setUserpassword(password);
	
	model.addAttribute("user",user);
	return "success";
}
*/


//This is the code for accessing data from view without creating a seperate User class for parameters
//@RequestMapping(path="/form",method = RequestMethod.POST )
//public String formHandler(@RequestParam("useremail") String email,
//						  @RequestParam("username") String name,
//						  @RequestParam("userpassword") String password,
//						  Model model)
//{
//	System.out.println("user email is:"+email);
//	System.out.println("user name is:"+name);
//	System.out.println("user password is:"+password);
//	
//	model.addAttribute("email",email);
//	model.addAttribute("name",name);
//	model.addAttribute("password",password);
//	return"success";
//}

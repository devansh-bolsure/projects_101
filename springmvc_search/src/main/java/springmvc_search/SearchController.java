package springmvc_search;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController 
{
	@RequestMapping("/user/{id}/{name}")
	public String getuserDetail(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		System.out.println(id);
		System.out.println(name);
		Integer.parseInt(name);
		return "home";
	}
	
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("This is home handler");
		String a=null;
		System.out.println(a.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		String url="https://www.google.com/search?q="+query;
		RedirectView rdrView=new RedirectView();
		rdrView.setUrl(url);
		
		return rdrView ;
	}
	
	//handling exception in our spring mvc
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler( value=NullPointerException.class)
//	public String exceptionHandlerNull(Model m)
//	{
//		m.addAttribute("msg","Null Pointer Execption has occured");
//		return "null_page";
//	}
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler( value=NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m)
//	{
//		m.addAttribute("msg","Number Format Execption has occured");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler( value=Exception.class)
//	public String exceptionHandlerGeneric(Model m)
//	{
//		m.addAttribute("msg","Number Format Execption has occured");
//		return "null_page";
//	}
}


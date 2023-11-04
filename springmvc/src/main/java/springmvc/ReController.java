package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController
{
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("this is one handler");
		RedirectView rdrView=new RedirectView();
		rdrView.setUrl("https://www.google.com");
		return rdrView;
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is enjoy handler");
		return"";
	}
}

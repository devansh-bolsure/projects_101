package springmvc_search;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler 
{
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler( value=NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","Null Pointer Execption has occured");
		return "null_page";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler( value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m)
	{
		m.addAttribute("msg","Number Format Execption has occured");
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler( value=Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg","Number Format Execption has occured");
		return "null_page";
	}
}

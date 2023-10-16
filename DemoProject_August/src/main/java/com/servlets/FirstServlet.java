package com.servlets;

import java.io.*;
import java.util.Date;

import jakarta.servlet.*;

public class FirstServlet implements Servlet
{
	//Life Cycle Methods
	
	ServletConfig conf;
	
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		
		System.out.println("Creatin Object.....");
	}
	
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		System.out.println("Servicing.....");
		
		//set the content type of the response
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		
		out.println("<h1>this is my output from servlet method</h1>");
		out.println("<h1>todays date and time is "+new Date().toString()+"</h1>");

	}
	
	public void destroy()
	{
		System.out.println("Going to Destroy Servlet Object");
	}
	
	//Non_lifecycle methods
	
	public ServletConfig getServletConfig()
	{
		return this.conf;
	}
	
	public String getServletInfo()
	{
		return "this servlet is created by Devansh Bolsure";
	}

	
	
	
	
}

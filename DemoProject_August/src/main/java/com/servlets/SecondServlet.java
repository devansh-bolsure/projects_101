package com.servlets;

import java.io.*;
import java.util.Date;

import jakarta.servlet.*;

public class SecondServlet extends GenericServlet
{
	

	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("this is servlet using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>this is my second servlet using generic servlet "+new Date().toString()+"</h1>");
		
	}
}

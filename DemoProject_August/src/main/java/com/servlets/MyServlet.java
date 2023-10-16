package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		System.out.println("This is get method.....");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>this is get method of my servlet</h1>");
	}
	
}

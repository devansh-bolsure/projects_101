package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		
		String name=req.getParameter("name");
		out.println("<h1>Hello"+name+"Welcome to my website...</h1>");
		
		out.println("<h1><a href='servlet2'> Go to Servlet 2</a></h1");
		
		
		//add a cookie
		
		Cookie c= new Cookie("user_name", name);
		resp.addCookie(c);
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		
		String name=req.getParameter("name");
		out.println("<h1>Hello "+name+" Welcome to my website...</h1>");
		
		out.println("<h1><a href='servlet2'> Go to Servlet 2</a></h1");
		
		
		//add a cookie
		
		Cookie c= new Cookie("user_name", name);
		resp.addCookie(c);
	}
	
}

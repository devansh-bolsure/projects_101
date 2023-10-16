package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		
		//getting all the cookies
		
		Cookie[]cookies=req.getCookies();
		
		boolean f=false;
		String name="";
		
		if(cookies==null)
		{
			out.println("<h1> You are new user go to home page and submit your username");
			return;
		}else
		{
			for(Cookie c:cookies)
			{
				String tname=c.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name=c.getValue();
				}
			}
		}
		
		if(f)
		{
			out.println("<h1>Hello "+name+" Welcome back to my website...<h1>");
			out.println("<h1>thank you</h1>");
		}else
		{
			out.println("<h1> You are new user go to home page and submit your name");
		}
		
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		
		//getting all the cookies
		
		Cookie[]cookies=req.getCookies();
		
		boolean f=false;
		String name="";
		
		if(cookies==null)
		{
			out.println("<h1> You are new user go to home page and submit your name");
			return;
		}else
		{
			for(Cookie c:cookies)
			{
				String tname=c.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name=c.getValue();
				}
			}
		}
		
		if(f)
		{
			out.println("<h1>Hello "+name+" Welcome back to my website...<h1>");
			out.println("<h1>thank you</h1>");
		}else
		{
			out.println("<h1> You are new user go to home page and submit your name");
		}
		
		
	}
	
}


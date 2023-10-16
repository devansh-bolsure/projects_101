package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		out.println("<h2>welcome to Register Servlet</h2>");
		
		String name= req.getParameter("user_name");
		String password= req.getParameter("user_password");
		String email= req.getParameter("user_email");
		String gender= req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		
		String cond=req.getParameter("conditions");
		
		if(cond!=null)
		{
			if(cond.equals("checked"))
			{
				out.println("<h2> name: "+ name+"</h2>");
				out.println("<h2> password: "+ password+"</h2>");
				out.println("<h2> email: "+ email+"</h2>");
				out.println("<h2> gender: "+ gender+"</h2>");
				out.println("<h2> course: "+ course+"</h2>");
				
				//JDBC
				
				//
				
				//saved to db
				//......
				
				RequestDispatcher rd= req.getRequestDispatcher("success");
				rd.forward(req, resp);
				
				
			}else
			{
				out.println("<h2>you have not accepted terms and conditions</h2>");
			}
			
		}else
		{
			
			out.println("<h2>you have not accepted terms and conditions</h2>");
			// i want to include output of index.html
			
			//get the object of request dispatcher
		
			RequestDispatcher rd= req.getRequestDispatcher("index.html");
			
		
			
			//include
			rd.include(req, resp);
			
			
		}
		
		
	}
	
}

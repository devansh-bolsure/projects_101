package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
		
		out.println("<h1> your name is "+name+"</h1>");
//		out.println("<a href='Servlet2?user="+name+"'>Go to Second Servlet</a>");
		
		//hidden form field coding.....
		
		out.println(""
				+" <form action='Servlet2'>"
				+" <input type='hidden' name='user_name' value='"+name+"'/>"
				+"<button> Go to Second Servlet</button> "
				+" "
				+" "
				+" </form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
		
		out.println("<h1> your name is "+name+"</h1>");
//		out.println("<a href='Servlet2?user="+name+"'>Go to Second Servlet</a>");
		
		//hidden form field coding.....
		
		out.println(""
				+" <form action='Servlet2'>"
				+" <input type='hidden' name='user_name' value='"+name+"'/>"
				+"<button> Go to Second Servlet</button> "
				+" "
				+" "
				+" </form>");
	}

}

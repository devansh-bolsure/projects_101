package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1 Style='color:blue;'>Welcome to servlet 2</h1>");
		
		//url fetch
		
		String name=request.getParameter("user_name");
		out.println("<h1 Style='color:red;'>Welcome back "+name+"</h1>");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1 Style='color:blue;'>Welcome to servlet 2</h1>");
		
		//url fetch
		
		String name=request.getParameter("user_name");
		out.println("<h1 Style='color:red;'>Welcome back "+name+"</h1>");

	}

}

package com.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		
		out.println(name);
		out.println(password);
		out.println(email);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		
		out.println(name);
		out.println(password);
		out.println(email);
		
		//connection...
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","DevaAsh347@&");
			
			//query...
			
			String q= "insert into user30(name,password,email) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			 pstmt.setString(1, name);
			 pstmt.setString(2, password);
			 pstmt.setString(3, email);
			 
			 pstmt.executeUpdate();
			 
			 out.println("<h1>Done.....</h1>");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			out.println("<h1>Error....</h1>");
		}
		
		
		
		//query....
		
		//......
	}

}

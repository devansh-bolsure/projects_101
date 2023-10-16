package com.attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		
		PrintWriter out= resp.getWriter();
		
		int nn1=Integer.parseInt(req.getParameter("n1"));
		int nn2=Integer.parseInt(req.getParameter("n2"));
		
		int p= nn1*nn2;
		
		//get attribute from request object
		
		int sum=(int)req.getAttribute("sum");
		
		out.println("<h1>");
		out.println("sum is:"+sum);
		out.println("product is:"+p);
		out.println("</h1>");
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out= resp.getWriter();
		
		int nn1=Integer.parseInt(req.getParameter("n1"));
		int nn2=Integer.parseInt(req.getParameter("n2"));
		
		int p= nn1*nn2;
		
		//get attribute from request object
		
		int sum=(int)req.getAttribute("sum");
		
		out.println("<h1>");
		out.println("sum is:"+sum);
		out.println("product is:"+p);
		out.println("</h1>");
	}
	

}

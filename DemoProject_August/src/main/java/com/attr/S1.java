package com.attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		
		PrintWriter out= resp.getWriter();
		
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		//add
		
		int s= nn1+nn2;
		
		req.setAttribute("sum", s);
		
		RequestDispatcher rd=req.getRequestDispatcher("s2");
		
		rd.forward(req, resp);
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
PrintWriter out= resp.getWriter();
		
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		//add
		
		int s= nn1+nn2;
		
		req.setAttribute("sum", s);
		
		RequestDispatcher rd=req.getRequestDispatcher("s2");
		
		rd.forward(req, resp);
		
	}
	

}

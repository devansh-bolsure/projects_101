package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SuccessServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		out.println("This is success servlet");
		out.println("<h2>Successfully registered</h2>");
	}
}

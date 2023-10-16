package com.servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.List;
import com.entities.Note; // Import your Note entity here
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.helper.FactoryProvider; // Import your FactoryProvider here

public class ListNotesServlet extends HttpServlet 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try 
        {
            Session s = FactoryProvider.getFactory().openSession();
            Query<Note> q = s.createQuery("from Note", Note.class);
            List<Note> list = q.getResultList();
            s.close();
            
            // Set the list of notes as an attribute in the request
            request.setAttribute("notesList", list);
            
            // Forward the request to your JSP page
            RequestDispatcher dispatcher = request.getRequestDispatcher("listNotes.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}


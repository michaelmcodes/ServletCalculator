package com.michaelmark;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class AddServlet extends HttpServlet {
	
	// MUST use service(or subclass) methods when using Servlet
	// Request fetches the data from client, response send a response to client
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		// create cookie to store k value
		Cookie cookie = new Cookie("k", k + "");
		
		// send this cookie over to SqServlet
		res.addCookie(cookie);
		res.sendRedirect("SqServlet");
		
	}

}

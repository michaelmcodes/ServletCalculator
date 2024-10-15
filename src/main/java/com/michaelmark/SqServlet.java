package com.michaelmark;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
		
		// get cookie from AddServlet
		Cookie cookies[] = req.getCookies();
		
		// fetch the value from the cookie "k"
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		// square
		k = k*k;
		
		// print output to user
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);

	}
}

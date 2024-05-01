package com.vp.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class includedServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//write the included content
		
		response.getWriter().println("<h2>Included Servlet</h2>");
		response.getWriter().println("<p>This servlet included in the main servlet</p>");
		
		
	}
}

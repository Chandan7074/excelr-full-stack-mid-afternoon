package com.vp.main;
import javax.servlet.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MainServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {

	response.setContentType("text/html");
	
	//write the main content
	response.getWriter().println("<h1>Main Servlet</h1>");
	response.getWriter().println("<p> This is the main Servlet </p>");
	
	//including the content of another servlet
	request.getRequestDispatcher("/includedServlet").include(request,response);
   }
}
/*demonstrate the use of include() drictive in servlets. The include() directive allows us to include the content of  another servlet or JSP page in the response of the current servlet.abstract*/
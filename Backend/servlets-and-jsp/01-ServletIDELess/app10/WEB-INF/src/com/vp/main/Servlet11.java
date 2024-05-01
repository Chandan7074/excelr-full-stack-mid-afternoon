package com.vp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet11 extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Welcome to Servlet11");
        // in order to read any input we use request objects getParameter method

        String s1 = request.getParameter("firstName");
        String s2 = request.getParameter("lastName");
        out.println("Your First Name" + s1);
        out.println("Your First Name" + s2);
        out.println("Good bye from Servlet");
    }
}

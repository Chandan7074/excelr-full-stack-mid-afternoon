package com.vp.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet15 extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Welcome to Servlet15");
        out.println("<br/>");
        // in order to read any input we use request objects getParameter method

        String s1 = request.getParameter("firstName");
        String s2 = request.getParameter("lastName");
        out.println("Your First Name: " + s1);
        out.println("<br/>");
        out.println("Your last Name :" + s2);
        out.println("<br/>");

        out.println("Your Full Name: " + s1 + " " + s2);
        out.println("<br/>");
        out.println("Good bye from Servlet15");
        out.println("<br/>");

        out.println("</body></html>");

        int status = DbUtil.save(s1, s2);
        if (status == 1) {
            out.println("saved ub the db succesfully");
        } else {
            out.println("there was some error");
        }
    }
}

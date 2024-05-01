package com.vp.main;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
//	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginapp", "root", "admin");
					PreparedStatement pstmt = con.prepareStatement("SELECT * FROM USER WHERE USER=? AND PASSWORD=?"))
			{
				pstmt.setString(1, userName);
				pstmt.setString(2, password);
				
				
				try(ResultSet rs = pstmt.executeQuery())
				{
					if(rs.next())
					{
						response.sendRedirect("welcome.jsp?useName=" + userName);
					}
					else
					{
						response.sendRedirect("loginError.jsp");
					}
				}
				
			}
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
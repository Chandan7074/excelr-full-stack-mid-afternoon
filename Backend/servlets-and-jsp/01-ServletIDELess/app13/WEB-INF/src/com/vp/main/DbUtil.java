package com.vp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
    public static int save(String firstName, String lastName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        String sql = "INSERT INTO STUDENTS VALUES('" + firstName + "', '" + lastName + "')";

        int status = 0;

        String url = "jdbc:mysql://localhost:3306/servlets";
        String userName = "root";
        String password = "admin";

        try (Connection con = DriverManager.getConnection(url, userName, password);
                Statement stmt = con.createStatement()) {
            status = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }
}

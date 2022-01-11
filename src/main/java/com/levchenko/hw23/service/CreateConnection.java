package com.levchenko.hw23.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw23?useUnicode=true&serverTimezone=UTC", "root", "toor");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

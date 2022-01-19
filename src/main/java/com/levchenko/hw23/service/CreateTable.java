package com.levchenko.hw23.service;

import java.sql.*;

public class CreateTable {


    public void createTableDevices() {
        Connection connection = CreateConnection.createConnection();
        String SQL = "CREATE TABLE devices (\n" +
                "  ID SERIAL ,\n" +
                "  type VARCHAR(20) NOT NULL,\n" +
                "  name VARCHAR(20),\n" +
                "  price INT NOT NULL,\n" +
                "  date DATE,\n" +
                " description VARCHAR(100),\n" +
                " availability BIT DEFAULT false,\n" +
                " factoryId INT,\n" +
                "  PRIMARY KEY (ID),\n" +
                "FOREIGN KEY (factoryId) REFERENCES factories(ID)\n" +
                ");";
        try {
            Statement statement = connection.createStatement();
            statement.execute(SQL);

            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void createTableFactory() {
        Connection connection = CreateConnection.createConnection();
        String SQL = "CREATE TABLE factories (\n" +
                "  ID INT ,\n" +
                "  name VARCHAR(20),\n" +
                " country VARCHAR(20),\n" +
                "  PRIMARY KEY (ID)\n" +
                ");";
        try {
            Statement statement = connection.createStatement();
            statement.execute(SQL);

            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        CreateTable createTable = new CreateTable();
        createTable.createTableFactory();
        createTable.createTableDevices();
    }
}

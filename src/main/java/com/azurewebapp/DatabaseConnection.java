package com.azurewebapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // JDBC driver and database URL
    private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DB_URL = "jdbc:sqlserver://405825dbserver.database.windows.net:1433;databaseName=405825db";

    // Database credentials
    private static final String USER = "sqladmin";
    private static final String PASS = "Qa12#456";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}

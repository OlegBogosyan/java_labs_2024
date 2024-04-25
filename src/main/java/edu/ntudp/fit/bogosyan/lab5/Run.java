package edu.ntudp.fit.bogosyan.lab5;

import java.util.Scanner;
import java.sql.*;


public class Run {
    private static final String URL = "jdbc:mysql://localhost:3306/java_lab5";
    private static final String USER = "root";
    private static final String PASSWORD = "bogosyan123";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)
        ){
            SQLManager sqlManager = new SQLManager();
            sqlManager.find_students_by_birthday(scanner,connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
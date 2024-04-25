package edu.ntudp.fit.bogosyan.lab5;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLManager {

    public String find_students_by_birthday(Scanner scanner, Connection connection) throws SQLException {
        String query = "";
        System.out.print("Програма виводить інформацію про студентів, які народилися у вказаному місяці.\n" +
                "Вкажіть місяць 1-12 (якщо нічого не вказати - виведеться інформація про всіх студентів): ");
        try {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 12) {
                    query = "SELECT * FROM students WHERE MONTH(birthday) =" + choice + ";";
                }
            } else {
                query = "SELECT * FROM students;";
            }
            PreparedStatement preparedStatement  = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s%n",
                    "#", "Last name", "First name", "Patronymic", "Birthday", "Gradebook"
            );
            while (resultSet.next()) {
                System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s%n",
                        resultSet.getInt("ID"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("patronymic"),
                        resultSet.getDate("birthday"),
                        resultSet.getString("gradebook")
                );
            }
            return null;
        } catch (NumberFormatException e) {
            System.out.print("Ви ввели недопустиме значення, спробуйте ще раз!\n\n");
            return find_students_by_birthday(scanner, connection);
        }
    }
}





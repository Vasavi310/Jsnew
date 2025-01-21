// File: ExecuteStoredProcedure.java
import java.sql.*;
import java.util.Scanner;

public class Storedprocedure {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/employee"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        // Stored procedure call
        String storedProcedureCall = "{CALL UpdateSalaryAndInsertBook(?, ?, ?, ?, ?, ?)}";

        try {Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             CallableStatement callableStatement = connection.prepareCall(storedProcedureCall);
             Scanner scanner = new Scanner(System.in);

            // Input for department ID to update salaries
            System.out.print("Enter ID to update employee salaries: ");
            int id = scanner.nextInt();

            // Input for inserting a book
            System.out.print("Enter Book ID: ");
            int bookid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter Book Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Enter Book Price: ");
            int price = scanner.nextInt();

            // Set parameters for the stored procedure
            callableStatement.setInt(1, id);          // department ID for salary update
            callableStatement.setInt(2, bookid);          // book ID
            callableStatement.setString(3, title);        // book title
            callableStatement.setString(4, author);       // book author
            callableStatement.setString(5, publisher);    // book publisher
            callableStatement.setInt(6, price);        // book price

            // Execute the stored procedure
            callableStatement.execute();

            System.out.println("Employee salaries updated and book inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

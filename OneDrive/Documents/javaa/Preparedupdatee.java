// File: UpdateEmployeeSalary.java
import java.sql.*;
import java.util.Scanner;

public class Preparedupdatee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/employee"; // Replace with your database URL

        //private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
   
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        // SQL query to update employee salary by 2% where id matches
        String updateSalaryQuery = "UPDATE emp SET salary = salary * 1.02 WHERE id = ?";
         String query="select * from emp";

        try {Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(updateSalaryQuery);
            

            // Get the dept_id from the user
            System.out.print("Enter the department ID to update salaries: ");
            int id1= scanner.nextInt();

            // Set the id parameter in the query
            preparedStatement.setInt(1, id1);

            // Execute the update query
            int rowsAffected = preparedStatement.executeUpdate();

            // Output the result
            System.out.println("Salaries updated for department ID: " +id1);
            System.out.println("Number of rows affected: " + rowsAffected);

            Statement st=connection.createStatement();
            
            ResultSet resultSet = st.executeQuery(query);
             System.out.println("Employee Records:");
            while (resultSet.next()) {
                // Retrieve the record fields using ResultSet
                int id= resultSet.getInt("id");
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                int age = resultSet.getInt("age");
                int salary = resultSet.getInt("salary");

                // Print out the retrieved values
                System.out.println("Employee ID: " + id);
                System.out.println("fname: " + fname);
                System.out.println("lname: " + lname);
                System.out.println("age: " + age);
                System.out.println("salary: " + salary);
                System.out.println("--------------");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

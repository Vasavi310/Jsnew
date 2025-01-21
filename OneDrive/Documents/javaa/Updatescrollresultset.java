
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatescrollresultset {
    public static void main(String[] args) throws ClassNotFoundException {

        String jdbcURL = "jdbc:mysql://localhost:3306/employee"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password


        String query = "SELECT id,fname,lname,age,salary FROM emp";

        try {Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a scrollable and updatable ResultSet
            Statement statement = connection.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,      
                ResultSet.CONCUR_UPDATABLE            
            );

            // Execute the query to get the ResultSet
            ResultSet resultSet = statement.executeQuery(query);

            // Scroll to the last row and display the data
            if (resultSet.last()) {
                System.out.println("Last Employee:");
                printEmployee(resultSet);
            }

            // Scroll back to the first row and display the data
            if (resultSet.first()) {
                System.out.println("First Employee:");
                printEmployee(resultSet);
            }

            // Scroll to an absolute row (e.g., 3rd row) and display the data
            if (resultSet.absolute(3)) {
                System.out.println("Third Employee:");
                printEmployee(resultSet);
            }

          /*  // Update a record's salary using the ResultSet
            resultSet.absolute(2); // Move to the second row
            int oldSalary = resultSet.getInt("salary");
            int newSalary = oldSalary * 2; // Increase salary by 5%
            resultSet.updateInt("salary", newSalary);
            

            resultSet.updateRow(); */

            System.out.println("Updated Employee (2nd row) Salary: ");
            printEmployee(resultSet);

          resultSet.moveToInsertRow(); // Move to a special insert row

// Ensure column names match exactly those in the database
resultSet.updateInt("id", 10); // Use "id" or "emp_id" based on the actual column name
resultSet.updateString("fname", "Aarthi");
resultSet.updateString("lname", "Chevu");
resultSet.updateInt("age", 19);
resultSet.updateInt("salary", 150000);

resultSet.insertRow(); // Insert the row in the database


System.out.println("Inserted a new employee.");

}
catch(SQLException q)
{
   q.printStackTrace();
}
}

    // Utility method to print employee details
    private static void printEmployee(ResultSet resultSet) throws SQLException {
        int empId = resultSet.getInt("id");
        String fname = resultSet.getString("fname");
        String lname = resultSet.getString("lname");
        int age = resultSet.getInt("age");
        int salary = resultSet.getInt("salary");

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee fName: " + fname);
        System.out.println("last name: " + lname);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
        System.out.println("------------------------");
    }
}

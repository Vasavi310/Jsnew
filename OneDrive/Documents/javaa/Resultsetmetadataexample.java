// File: ResultSetMetaDataExample.java
import java.sql.*;

public class Resultsetmetadataexample {
    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcURL = "jdbc:mysql://localhost:3306/employee";
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        String query = "SELECT * FROM emp"; // Replace with your table name


        try {Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);

            // Get the metadata of the result set
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Number of columns
            int columnCount = metaData.getColumnCount();

            // Print column names
            System.out.println("Table and Column names:");
            for (int i = 1; i <= columnCount; i++) {
                String tableName = metaData.getTableName(i);
                String columnName = metaData.getColumnName(i);
                System.out.print(columnName + " (" + tableName + ") | ");
            }
            System.out.println(); // Newline after printing column names

            // Print rows data
            System.out.println("\nRow data:");
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    Object columnValue = resultSet.getObject(i); // Fetch value based on column index
                    System.out.print(columnValue + " | ");
                }
                System.out.println(); // Newline after printing each row
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

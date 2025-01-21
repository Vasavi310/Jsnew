<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, javax.sql.*" %>

    <h1>Employee Details</h1>

    <%
        // MySQL database connection details
        String dbURL = "jdbc:mysql://localhost:3306/jdbcdb"; 
        String dbUser = "root"; 
        String dbPassword = "ramesh";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // Create a statement object
            stmt = conn.createStatement();

            // Execute a SQL query to fetch employee data
            String sql = "SELECT id, name, age, department FROM employeenew";
            rs = stmt.executeQuery(sql);

            // Display the result in a table
    %>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Department</th>
                </tr>
    <%
            while (rs.next()) {
    %>
                <tr>
                    <td><%= rs.getInt("id") %></td>
                    <td><%= rs.getString("name") %></td>
                    <td><%= rs.getInt("age") %></td>
                    <td><%= rs.getString("department") %></td>
                </tr>
    <%
            }
    %>
            </table>
    <%
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                out.println("Error closing resources: " + ex.getMessage());
            }
        }
    %>
    
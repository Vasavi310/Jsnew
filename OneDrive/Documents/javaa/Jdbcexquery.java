import java.sql.*;
import java.util.Scanner;

public class Jdbcexquery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn=null;
        ResultSet rs=null;
        Statement st=null;
        String query="select * from emp";
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
            st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);
            rs=st.executeQuery(query);
            if(rs.last())
            {
                System.out.println("last");
                print(rs);
            }
            if(rs.absolute(4))
            {
                System.out.println("last");
                print(rs);
            }
            rs.absolute(3);
            int oldsal=rs.getInt("salary");
            int newsal=oldsal+100000;
            rs.updateInt("salary",newsal);
            rs.updateRow();
            print(rs);


        }
        catch(SQLException a)
        {
            a.printStackTrace();
        }
    }
    public static void print(ResultSet rs) {
        try {
            int empId = rs.getInt("id");
            String empName = rs.getString("fname");
            String dob = rs.getString("lname");
            int age = rs.getInt("age");
            int salary = rs.getInt("salary");
    
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Last Name: " + dob);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

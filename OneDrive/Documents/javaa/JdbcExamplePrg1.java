 import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.Statement;
 import  java.sql.SQLException;
 import java.sql.DriverManager;
  
    public class JdbcExamplePrg1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // store the SQL statement in a string
        String QUERY = "select * from emp where id <46";
        //register the Mysql/oracle driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver"); 
  
        try {
		
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        
                Statement statemnt1 = conn.createStatement();
                // After Creating the statement, execute it 
          ResultSet rs1 = statemnt1.executeQuery(QUERY); 
                                       //Get the values of the record using while loop from result set
                    while(rs1.next())
                    {
                        int id = rs1.getInt(1);
                        String fname = rs1.getString(2);
                        String lname = rs1.getString(3);
                        int age = rs1.getInt(4);
                        int salary = rs1.getInt(5);
                        //String totalMarks= rs1.getInt(5);
                        //store the values which are retrieved using ResultSet and print them
                    System.out.println(id + ","+fname+ ","+lname+ ","+age +","+salary);
                    }
                 
        }
        catch(SQLException e) {
            //If any exception occurs,we can catch it and exit the program
            e.printStackTrace();
        }
       }
    }
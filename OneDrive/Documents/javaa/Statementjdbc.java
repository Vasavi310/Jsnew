import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
class Statementjdbc
{
    public static void main(String[] args)
    {
        String url="jdbc:mysql://localhost:3307/employee";
        String username="root";
        String pwd="root";
        try
        {
            Connection conn=DriverManager.getConnection(url,username,pwd);
            Statement st=conn.createStatement();
            String q1="insert into emp(id,fname,lname,age,salary) values(15,'qq','rr',19,1700000)";
            int rin=st.executeUpdate(q1);
            System.out.println("rows inserted= "+rin);
            String q2="select * from emp";
            ResultSet rs=st.executeQuery(q2);
            while(rs.next())
            {
                int id1=rs.getInt("id");
                String fname1=rs.getString("fname");
                String lname1=rs.getString("lname");
                int sal=rs.getInt("salary");
                System.out.println(id1+" "+fname1+" "+lname1+" "+sal);
            }
            String q3="update emp set salary=salary+1200000 where id=33";
            int rup=st.executeUpdate(q3);
            System.out.println("rows updated= "+rup);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

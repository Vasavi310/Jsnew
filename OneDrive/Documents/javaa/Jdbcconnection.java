import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Jdbcconnection{
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement p1=null;
        PreparedStatement p2=null;
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
            System.out.println("connected");
            conn.setAutoCommit(false);
            String sql1="update empd set salary=salary-? where did=?";
            p1=conn.prepareStatement(sql1);
            p1.setInt(1,200000);
            p1.setInt(2,101);
            
            String sql2="update empd set salary=salary+? where did=?";
            p2=conn.prepareStatement(sql2);
            p2.setInt(1,100000);
            p2.setInt(2,102);

            p1.executeUpdate();
            p2.executeUpdate();
            conn.commit();
        }
        catch (SQLException ex) {
            if(conn!=null)
            {
                try{
                 conn.rollback();
                 System.out.println("Rollbacked successfully");
                }
                catch(SQLException e)
                {
                   e.printStackTrace();
                }
               ex.printStackTrace();
            }
        }
    }  
}              

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
class Jdbcex
{
   public static void main(String[] args)throws ClassNotFoundException
   {
       Connection c1=null;
       Connection c2=null;
       Connection c3=null;
       try{
         String url1="jdbc:mysql://localhost:3306/employee";
         String user="root";
         String pwd="root";
         c1=DriverManager.getConnection(url1,user,pwd);
         if(c1!=null)
            System.out.println("Connected");
         String url2="jdbc:mysql://localhost:3306/employee?user=root&password=root";
         c2=DriverManager.getConnection(url2);
         if(c2!=null)
           System.out.println("Connected");
         String url3="jdbc:mysql://localhost:3306/employee";
         Properties p=new Properties();
         p.put("user","root");
         p.put("password","root");
         c3=DriverManager.getConnection(url3,p);
         if(c3!=null)
           System.out.println("Connected");
       }
       catch(SQLException e)
       {
            e.printStackTrace();
       }
   }
}
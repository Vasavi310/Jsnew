import java.util.*;
import java.sql.*;
class Preparedupd
{
   public static void main(String[] args)throws ClassNotFoundException
   {
       Scanner sc=new Scanner(System.in);
       String url="jdbc:mysql://localhost:3306/employee";
       String user="root";
       String pwd="root";
       String qq="update empd set age=19 where did=?";
       String query="select * from empd";
       try{
           Connection conn=DriverManager.getConnection(url,user,pwd);
           if(conn!=null)
               System.out.println("Connected");
           PreparedStatement p=conn.prepareStatement(qq);
           System.out.println("Enter dept id");
           int did=sc.nextInt();
           p.setInt(1,did);
           int r=p.executeUpdate();
           System.out.println("the rows thatr affected= "+r);
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery(query);
           while(rs.next())
           {
               int id=rs.getInt(1);
               String fname=rs.getString(2);
               String lname=rs.getString(3);
               int age=rs.getInt(4);
               int salary=rs.getInt(5);
               int did1=rs.getInt(6);
               System.out.println(id+" "+fname+" "+lname+" "+age+" "+salary+" "+did1);
           }
       } 
       catch(SQLException e)
       {
           e.printStackTrace();
       }
   }
}
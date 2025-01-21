
import java.sql.*;
import java.util.*;
public class Preparedst
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
        String q1="insert into emp(id,fname,lname,age,salary)values(?,?,?,?,?)";
        ps=conn.prepareStatement(q1);
        ps.setInt(1,102);
        ps.setString(2,"nn");
        ps.setString(3,"oo");
        ps.setInt(4,19);
        ps.setInt(5,1900000);
        int rinp=ps.executeUpdate();
        System.out.println("rows inserted= "+rinp);
        String q2="select * from emp where age>?";
        ps=conn.prepareStatement(q2);
        ps.setInt(1,18);
        rs=ps.executeQuery();
        while(rs.next())
        {
            int id=rs.getInt("id");
            String fname=rs.getString("fname");
            String lname=rs.getString("lname");
            int sal=rs.getInt("salary");
            System.out.println(id+" "+fname+" "+lname+" "+sal);
        }
        System.out.println("enter age");
        int r1=sc.nextInt();
        String q3="update emp set salary=1500000 where age=?";
        ps=conn.prepareStatement(q3);
        ps.setInt(1,r1);
        int rupd=ps.executeUpdate();
        System.out.println("rows updated= "+rupd);
    }
    catch(ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(SQLException aa)
    {
        aa.printStackTrace();
    }
    finally{
        try{
        if(conn!=null)
           conn.close();
        if(ps!=null)
           ps.close();
        if(rs!=null)
           rs.close();
        }
        catch(SQLException a)
        {
            a.printStackTrace();
        }
    }
    }
}
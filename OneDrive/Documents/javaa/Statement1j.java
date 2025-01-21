import java.sql.*;
class Statement1j
{
    public static void main(String[] args)
    {
        PreparedStatement ps=null;
        PreparedStatement ps1=null;
        Connection conn=null;
        ResultSet rs=null;
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
            String q1="insert into emp(id,fname,lname,age,salary)values (?,?,?,?,?)";
            ps=conn.prepareStatement(q1);
            ps.setInt(1,28);
            ps.setString(2,"ii");
            ps.setString(3,"jj");
            ps.setInt(4,15);
            ps.setInt(5,180000);
            int rin=ps.executeUpdate();
            System.out.println("rows inserted= "+rin);
            String q2="select * from emp";
            ps1=conn.prepareStatement(q2);
            rs=ps1.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("id");
                String fname=rs.getString("fname");
                System.out.println(id+" "+fname);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(conn!=null) conn.close();
                if(ps!=null) ps.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
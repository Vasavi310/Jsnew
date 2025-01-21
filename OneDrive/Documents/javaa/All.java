import java.sql.*;
class All
{
    public static void main(String[] args)
    {
        Connection conn=null;
        ResultSet rs=null;
        Statement st=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
            st=conn.createStatement();
            String q1="insert into emp(id,fname,lname,age,salary)values(109,'q5','r1',29,1300000)";
            int rin=st.executeUpdate(q1);
            System.out.println("rows inserte= "+rin);
            String q2="select * from emp";
            rs=st.executeQuery(q2);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String fname=rs.getString("fname");
                System.out.println(id+" "+fname);
            }
        }
        catch(ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } 
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }
        finally{
            try{
            if(conn!=null)conn.close();
            if(st!=null)st.close();
            if(rs!=null)rs.close();
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
        }
    }
}
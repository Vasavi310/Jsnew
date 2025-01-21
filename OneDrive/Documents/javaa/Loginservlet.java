import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Loginservlet
{
    public static final String validuser="vasavi";
    public static final String validpwd="123";
    public Loginservlet()
    {
        super();
        System.out.println("constructor called");
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date=new Date();
        if(username.equals(validuser)&&password.equals(pwd))
        {
            response.setContentType="text/html";
            PrintWriter out=response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Login credentials valid</h1>");
            out.println("<h2>username:"+username+" date:"+s.format(date)+"</h2>");
            out.println("</body></html>");
        }
        else
        {
            response.setContentType="text/html";
            PrintWriter out=response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Login credentials invalid</h1>");
            out.println("<a href=\"Loginser.html\">Try again</a>");
            out.println("</body></html>");
        }
    }
}
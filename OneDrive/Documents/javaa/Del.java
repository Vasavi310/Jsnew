import java.io.File;
import java.io.*;
class Del
{
   public static void main(String[] args)throws IOException
   {
       int c;
       FileInputStream fis=new FileInputStream("file1.txt");
       FileOutputStream fos=new FileOutputStream("file2.txt");
       while((c=fis.read())!=-1)
       {
           char q=c.toLowerCase();
       }
       while((c=fis.read())!=-1)
       {
            char r=c.toUpperCase();
            fos.write(r);
       }
       System.out.println("switched to uppercase successfully");
   }
}
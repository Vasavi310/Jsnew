import java.io.File;
import java.io.*;
class Lowupper
{
   public static void main(String[] args)throws IOException
   {
       int c;
       String s="";
       File f=new File("file2.txt");
       BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
       FileWriter fos=new FileWriter(f);
       String line=br.readLine();
       while(line!=null)
       {
           s=s+line;
           line=br.readLine();
       }
       String line1=s.toLowerCase();
       System.out.println("converted to lowercase successfully "+line1);
       String line2=s.toUpperCase();
       System.out.println("converted to uppercase successfully "+line2);
       fos.write(line2);
       System.out.println("switched to uppercase successfully");
   }
}
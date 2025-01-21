import java.io.*;
import java.util.*;
class Merge1
{
   public static void main(String[] args)throws IOException
   {
       Scanner sc=new Scanner(System.in);
       PrintWriter pw=new PrintWriter("file4.txt");
       BufferedReader br=new BufferedReader(new FileReader("file3.txt"));
       String s=br.readLine();
       while(s!=null)
       {
          pw.println(s);
          s=br.readLine();
       }
       br=new BufferedReader(new FileReader("file2.txt"));
       s=br.readLine();
       while(s!=null)
       {
          pw.println(s);
          s=br.readLine();
       }
       pw.close();
       br.close();
       System.out.println("merged successfully");
  }
}


import java.io.*;
class Uplow
{
   public static void main(String[] args)throws IOException
   {
      boolean flag=true;
      String f1="file2.txt";
      String f2="file3.txt";
      BufferedReader br=new BufferedReader(new FileReader(f1));
      BufferedWriter bw=new BufferedWriter(new FileWriter(f2));
      String s;
      while((s=br.readLine())!=null)
      {
         if(flag)
           s=s.toUpperCase();
         else
           s=s.toLowerCase();
        bw.write(s);
      }
      br.close();
      bw.close();
      System.out.println("coverted");
   }
}
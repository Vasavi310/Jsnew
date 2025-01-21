import java.io.*;
class Copya
{
   public static void main(String[] args)throws IOException
   {
      int c1,c2;
      FileReader fr1=new FileReader("file1.txt");
      FileReader fr2=new FileReader("file2.txt");
      FileWriter fw1=new FileWriter("file1.txt");
      FileWriter fw2=new FileWriter("file2.txt");
      while((c1=fr2.read())!=-1)
      {
         fw1.write(c1);
      }
      while((c2=fr1.read())!=-1)
      {
               fw2.write(c2);
      }
      System.out.println("successfully swapped");
   }
}
         
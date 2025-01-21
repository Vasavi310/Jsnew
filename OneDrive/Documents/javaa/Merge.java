import java.io.*;
class Merge
{
   public static void main(String[] args)throws IOException
   {
       int c;
       FileInputStream fr1=new FileInputStream("file1.txt");
       FileInputStream fr2=new FileInputStream("file2.txt");
       FileInputStream fr3=new FileInputStream("file3.txt");
       FileOutputStream fw=new FileOutputStream("file3.txt");
       while((c=fr1.read())!=-1)
       {
           fw.write(c);
           System.out.println((char)c);
       }
       while((c=fr2.read())!=-1)
       {
          fw.write(c);
          System.out.println((char)c);
       }
       System.out.println("written successfully");

    }
}
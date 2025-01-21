import java.util.*;
import java.io.*;
class Swap1
{
   public static void main(String[] args)throws IOException
   {
       String f1="file2.txt";
       String f2="file4.txt";
       try
       {
          swap(f1,f2);
          System.out.println("swapped successfully");
       }
       catch(IOException a)
       {
           System.out.println("exception raised");
       }
   }
   public static void swap(String f1,String f2)throws IOException
   {
       String r1=read(f1);
       String r2=read(f2);
       write(f2,r1);
       write(f1,r2);
   }
   public static String read(String f)throws IOException
   {
       StringBuilder r=new StringBuilder();
       try(BufferedReader br=new BufferedReader(new FileReader(f)))
       {
           String s;
           while((s=br.readLine())!=null)
           {
               r.append(s).append("\n");
           }
        }
         return r.toString();
   }
   public static void write(String f,String r)throws IOException
   {
       try(BufferedWriter bw=new BufferedWriter(new FileWriter(f)))
       {
           bw.write(r);
       }
    }
}
import java.io.*;
class Evenoddprime
{
   public static void main(String[] args)throws IOException
   {
      String f1="file1.txt";
      String f2="file2.txt";
      String f3="file3.txt";
      String f4="file4.txt";
      BufferedReader br=new BufferedReader(new FileReader(f1));
      BufferedWriter bw1=new BufferedWriter(new FileWriter(f2));
      BufferedWriter bw2=new BufferedWriter(new FileWriter(f3));
       BufferedWriter bw3=new BufferedWriter(new FileWriter(f4));
      String s;
      while((s=br.readLine())!=null)
      {
         String numbers[]=s.split("\\s+");
         for(String n:numbers)
         {
            int num=Integer.parseInt(s);
            if(isodd(num))
            {
                 bw1.write(String.valueOf(num));
            }
            else
                bw2.write(String.valueOf(num));
            if(isprime(num))
                bw3.write(String.valueOf(num));
         }
      }
      bw1.close();
      bw2.close();
      bw3.close();
      br.close();
   }

      public static boolean isodd(int n)
      {
         return n%2!=0;
      }
      public static boolean isprime(int n)
      {
          for(int i=2;i<=Math.sqrt(n);i++)
          {
              if(n%i==0)
                  return false;
          }
          return true;
      }
 }
                
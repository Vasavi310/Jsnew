import java.io.*;
import java.util.*;
class Fileb
{
    public static void main(String[] args)throws IOException
    {
        FileReader fis=new FileReader("file1.txt");
        FileOutputStream fos1=new FileOutputStream("file2.txt");
        FileOutputStream fos2=new FileOutputStream("file3.txt");
        FileOutputStream fos3=new FileOutputStream("file4.txt");
        BufferedReader br=new BufferedReader(fis);
        int count=0,c;
        String l=br.readLine();
        while(l!=null)
        {
               count++;}
        System.out.println(count);
        while((c=fis.read())!=-1)
        {
           if(c%2==0)
              fos1.write(c);
           if(c%2!=0)
              fos2.write(c);
           for(int i=2;i<=count/2;i++)
           {
              if(c%i!=0)
              {
                  fos3.write(c);
              }
           }
        }
        System.out.println("executed successfully");
    }
}
import java.io.*;
class Delete
{
   public static void main(String[] args)throws IOException
   {
      PrintWriter pw=new PrintWriter("input.txt");
      BufferedReader br1=new BufferedReader(new FileReader("output.txt"));
      String s1=br1.readLine();
      while(s1!=null)
      {
         boolean flag=false;
         BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
         String s2=br2.readLine();
         while(s2!=null)
         {
             if(s1.equals(s2))
             {
                flag=true;
                break;
             }
           s2=br2.readLine();
         }
         if(!flag)
             pw.println(s1);
         s1=br1.readLine();
        br2.close();
       }
       pw.flush();
       pw.close();
       br1.close();
    }
}
                 
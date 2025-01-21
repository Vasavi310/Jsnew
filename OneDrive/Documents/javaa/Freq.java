import java.io.*;
class Freq
{
  public static void main(String[] args)throws IOException
  {
     int count=0;
     String f1="file2.txt";
     String targetword="is";
     try(BufferedReader br=new BufferedReader(new FileReader(f1))){
       String s;
       while((s=br.readLine())!=null)
       {
          String[] words=s.split("\\s+");
          for(String word:words)
          {
              if(word.equalsIgnoreCase(targetword))
                  count++;
          }
       }
     }
     catch(IOException a)
     {
        System.out.println("exception occured"+a.getMessage());
     }
      System.out.println(count);
  }
}

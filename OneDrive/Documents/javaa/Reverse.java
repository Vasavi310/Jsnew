
import java.util.*;
class Reverse
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String res=rev(s);
       System.out.println(res);
   }
   public static String rev(String s)
   {
      String words[]=s.split("\\+s");
      StringBuilder rs=new StringBuilder();
      for(String word:words)
      {
          String rw=new StringBuilder(word).reverse().toString();
          rs.append(rw).append(" ");
      }
     return rs.toString().trim();
   }
}
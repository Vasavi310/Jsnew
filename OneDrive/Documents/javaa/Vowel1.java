import java.util.*;
class NovowelException extends Exception
{
   NovowelException(String message)
   {
       super(message);
   }
}
class Vowel1
{
   public static boolean checkv(String s)
   {
       for(char ch:s.toLowerCase().toCharArray())
       {
           if("aeiou".indexOf(ch)!=-1)
              return true;
       }
      return false;
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      try
      {
         if(!checkv(s))
            throw new NovowelException("exception occurs");
         else
         {
             System.out.println("occurs");
         }
      }
      catch(NovowelException a)
      {
          System.out.println("exception occurs");
      }
   }
}
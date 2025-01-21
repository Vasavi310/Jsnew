import java.util.*;
class Vowel
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int count=0;
      String s=sc.next();
      int n=s.length();
      for(int i=0;i<n;i++)
      {
          if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
          {
                count++;
          }
      }
      if(n==count)
         System.out.println("true");
      else
         System.out.println("false"); 
   }
}
import java.util.*;
class Ab
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String c="y";
      String x=sc.next();
      if(c.equals(x))
      {
        n=n+5;
        System.out.println(n);
      }
   }
}
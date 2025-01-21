import java.util.*;
class Lcm
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int x;
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       x=(n1>n2)?n1:n2;
       while(true)
       {
          if(x%n1==0 && x%n2==0)
          {
              System.out.println(x);
              break;
          }
          ++x;
       }
   }
}
      
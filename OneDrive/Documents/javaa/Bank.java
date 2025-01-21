import java.util.*;
class Bank
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       double n=sc.nextDouble();
       double a=sc.nextDouble();
       if(n>a)
       {
          n=n-a;
          System.out.println("money withdrawn");
          System.out.println(n);
          System.out.println("transaction successful"); 
       }
       else
       {
          System.out.println("money cannot be withdrawn"); 
       }
   }
}
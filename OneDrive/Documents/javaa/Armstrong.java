import java.util.*;
class Armstrong
{
   static int sum=0;
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int res=arm(n);
       if(n==res)
       {
         System.out.println("armstrong");
       }
       else
         System.out.println("not armstrong"); 
   }
   static int arm(int n)
   {
      while(n>0)
      {
         int rem=n%10;
         sum=sum+(rem*rem*rem);
         n=n/10;
      }
     return sum;
   }
}
import java.util.*;
class Reversenumber
{
   static int rev=0;
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int res=reve(n);
       System.out.println(res);
   }
   static int reve(int n)
   {
      if(n>0)
      {
      int rem=n%10;
      rev=(rev*10)+rem;
      reve(n/10);
      }
    return rev;
   }
      
}
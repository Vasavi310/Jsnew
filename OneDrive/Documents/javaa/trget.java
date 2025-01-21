import java.util.Scanner;
class Targett
{
   public static void main(String[]args)
   {
      int sum=0,count=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
         count++;
         int a=sc.nextInt();
         sum=a+sum;
         if(sum>=100)
         {
            System.out.println("the maximum turns taken is"+count);
           break;
         }
      }
     
   }
}
         
import java.util.Scanner;
class Choose
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>0 && b>0&&c>0)
      {
      if(a==2&& b==2 &&c==2)
         System.out.println("20");
      else if(a==b&& b==c&& c==a)
         System.out.println("10");
      else if(a==b && a!=c && b!=c)
         System.out.println("5");
      else if(a==b ||b==c ||c==a)
         System.out.println("2");
      else
          System.out.println("0");
      }
      else
      {
          System.out.println("invalid input");
      }
   }
}
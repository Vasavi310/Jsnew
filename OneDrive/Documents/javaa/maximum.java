import java.util.Scanner;
class Maximum
{
   void max(int a,int b,int c)
   {
      if(a>b)
      {
         if(a>c)
            System.out.println(a+"is greater");
         else
            System.out.println(c+"is greater");
      }
      else
      {
        if(b>c)
           System.out.println(b+"is greater");
        else
           System.out.println(c+"is greater");
      }
    }
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       Maximum p=new Maximum();
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       p.max(a,b,c);
   }
}
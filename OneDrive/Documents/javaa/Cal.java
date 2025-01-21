import java.util.*;
class Cal
{
   public static void main(String[] args)
   {
      double a,b,c,d;
      Scanner sc=new Scanner(System.in);
      a=sc.nextDouble();
       b=sc.nextDouble();
      char ch=sc.next().charAt(0);
      switch(ch)
      {
         case '+':c=a+b;
                  System.out.println(c);
                  break;
         case '-':c=a-b;
                  System.out.println(c);
                  break;
         case '*':c=a*b;
                  System.out.println(c);
                  break;
         case '/':d=a/b;
                  System.out.println(d);
                  break;
         case '%':c=a%b;
                  System.out.println(c);
                  break;
      }

   }
}
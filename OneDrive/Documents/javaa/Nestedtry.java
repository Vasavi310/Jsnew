import java.util.*;
class Nestedtry
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       try
       {
           try
           {
           
           int a[]=new int[5];
           a[10]=10;
           System.out.println(a[6]);
           }
           catch(ArrayIndexOutOfBoundsException a)
           {
              System.out.println("Array out of bounds");
           }
           finally
           {
              System.out.println("code executed after 1 try block");
           }
           try
           {
              int b=1/0;
           }
              catch(ArithmeticException a)
              {
                     System.out.println("division with zero isn't possible");
              }
          finally
          {
              System.out.println("code executed after 2 try blocks");
        }
       }
       finally
        {
            System.out.println("code executed out of 2 try blocks");
        }
   }
}
       
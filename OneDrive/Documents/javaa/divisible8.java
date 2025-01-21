import java.util.Scanner;
class Divisiblity
{
   public static void main(String []args)
   {
       int count=0;
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       while(a%8==0)
       {
          count++;
          if(a%8!=0)
         {
             System.out.println("the no. of valid numbers entered is"+count);
          }
        }
   }
}
       
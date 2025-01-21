import java.util.Scanner;
class Mahiral
{
   String w;
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       for(int i=0;i<m;i++)
       {
       String w=sc.next();
       sc.next();
       String s=w;
       if(w=="MON"|| w=="TUE"||w=="WED"||w=="THU"||w=="FRI"||w=="SAT"||w=="SUN")
       {
          
          int n=sc.nextInt();
          if((s=="MON"||s=="TUE"||s=="WED"||s=="THU") && (n>=700&&n<=1000))
             System.out.println("Successful");
          else if((s=="FRI"||s=="SAT"||s=="SUN") && (n>=1500))
             System.out.println("Unsuccesful");
          else
             System.out.println("invalid input");
       }
       
       console.log(s);
       }
   }
}
import java.util.*;
class Rev
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     StringBuilder s=new StringBuilder(str);
     s.reverse();
     String res=s.toString();
     System.out.println(res);
   }
}
import java.io.*;
import java.util.*;
class Password
{
   public static void main(String[] args)throws IOException
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int ch=check(s);
       switch(ch)
       {
          case 1:System.out.println("weak");
                 break;
          case 2:System.out.println("moderate");
                 break;
          case 3:System.out.println("strong");
                 break;
          default:System.out.println("invalid");
                 break;
      }
   }
   static int check(String s)
   {
       if(s.length()<8)
         return 0;
       boolean l=false,u=false,d=false,spc=false;
       for(char c:s.toCharArray())
       {
         if(Character.isLowerCase(c))
             l=true;
         else if(Character.isUpperCase(c))
             u=true;
         else if(Character.isDigit(c))
             d=true;
         else if(!Character.isLowerCase(c) && !Character.isWhitespace(c) && !Character.isDigit(c))
             spc=true;
       }
       if(l && u && spc && d)
           return 3;
       else if(l || u || spc || d)
           return 2;
        else
           return 1;
    }
} 
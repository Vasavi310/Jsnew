import java.util.*;
class Find
{
  public static void main(String[] args)
  {
     String s="i have 3 and 5 chocolates";
     int i=0,s1=0,d=0;
     String a[]=s.split("\\s+");
     for(String r:a)
     {
        try{
          int x=Integer.parseInt(r);
          i++;
        }
        catch(NumberFormatException a1)
        {
           try{
           double y=Double.parseDouble(r);
           d++;}
           catch(NumberFormatException a2)
           {
              s1++;
           }
        }
     }
     System.out.println("integer:"+i);
     System.out.println("string:"+s1);
     System.out.println("double:"+d);
  }
}

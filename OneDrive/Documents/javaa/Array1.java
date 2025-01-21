import java.util.*;
class Array1
{
   public static void print(int a[])
   {
       for(int i:a)
       {
          System.out.println(i);
       }
   }
   public static void main(String[] args)
   {
      int a[]={1,2,3,4,5};
      int h=a.length/2;
      int x[]=new int[h];
      int y[]=new int[a.length-h];
      System.arraycopy(a,0,x,0,h);
      System.arraycopy(a,h,y,0,a.length-h);
      print(x);
      print(y);
   }
  
}

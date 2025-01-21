import java.util.*;
class Trap
{
  public static void trapping(int a[])
  {
     int[] left=new int[a.length];
     left[0]=a[0];
     for(int i=1;i<a.length;i++)
     {
        left[i]=Math.max(a[i],left[i-1]);
     }
     int right[]=new int[a.length];
     right[a.length-1]=a[a.length-1];
     for(int i=a.length-2;i>=0;i--)
     {
        right[i]=Math.max(a[i],right[i+1]);
     }
     int trap=0;
     for(int i=0;i<a.length;i++)
     {
        int waterl=Math.min(left[i],right[i]);
        trap+=waterl-a[i];
     }
     System.out.println(trap);
  }
  public static void main(String[] args)
  {
     int a[]={4,2,0,6,3,2,5};
     trapping(a);
  }
}
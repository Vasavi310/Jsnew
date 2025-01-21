import java.util.*;
class Distinct
{
  public static void repeat(int a[])
  {
     int count=0;
     int n=a.length;
     for(int i=0;i<n-1;i++)
     {
       for(int j=0;j<n;j++)
       {
         if(a[i]==a[j])
            count=1;
       }
     }
     if(count==0)
       System.out.println("false");
     else
        System.out.println("true");
   }
  public static void main(String[] args)
  {
     int a[]={2,1,3,4,5,1,9};
     repeat(a);
  }
}
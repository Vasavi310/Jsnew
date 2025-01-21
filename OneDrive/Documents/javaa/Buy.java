import java.util.*;
class Buy
{
  public static void buy(int a[])
  {
     int maxprofit=0;
     int buyp=Integer.MAX_VALUE;
     int n=a.length;
     for(int i=0;i<n;i++)
     {
        if(buyp<a[i])
        {
           int profit=a[i]-buyp;
           maxprofit=Math.max(profit,maxprofit);
        }
        else
           buyp=a[i];
     }
     System.out.println(maxprofit);
  }
  public static void main(String[] args)
  {
     int a[]={7,1,5,3,6,4};
     buy(a);
  }
}
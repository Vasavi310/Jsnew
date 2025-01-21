class Prefix
{
  public static void max1(int a[])
  {
     int max=Integer.MIN_VALUE;
     int start=0,end=0;
     int n=a.length;
 int curr=0;
     int[] prefix=new int[n];
     prefix[0]=a[0];
     for(int i=1;i<n;i++)
     {
        prefix[i]=prefix[i-1]+a[i];
     }
     for(int i=0;i<n;i++)
     {
        start=i;
        for(int j=i;j<n;j++)
        {
           end=j;
           
           if(start==0)
             curr=prefix[end];
           else
             curr=prefix[end]-prefix[start-1];
        }
        if(curr>max)
          max=curr;
     }
     System.out.println(max);
  }
           
  public static void main(String[] args)
  {
     int a[]={1,-2,6,-1,3};
     max1(a);
  }
}
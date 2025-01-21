class Brute
{
   public static void max1(int a[])
   {
      int max=Integer.MIN_VALUE;
      int end=0,start=0;
      int n=a.length;
      for(int i=0;i<n;i++)
      {
         start=i;
         for(int j=i;j<n;j++)
         {
            end=j;
            int curr=0;
            {
               for(int k=start;k<=end;k++)
               {
                  curr=curr+a[k];
               }
               if(curr>max)
               {
                  max=curr;}
               
            }
         }
      }
      System.out.println(max);
   }
   public static void main(String[] args)
   {
      int a[]={1,-2,6,-1,3};
      max1(a);
   }
}
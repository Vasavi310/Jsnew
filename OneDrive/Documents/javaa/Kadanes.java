class Kadanes
{
  public static void maxa(int a[])
  {
      int max=Integer.MIN_VALUE;
      int cs=0;
      int n=a.length;
      for(int i=0;i<n;i++)
      {
         cs=cs+a[i];
         if(cs<0)
            cs=0;
          max=Math.max(cs,max);
      }
      System.out.println(max);
  }
      
  public static void main(String[] args)
  {
     int[] a={1,-2,6,-1,3};
     maxa(a);
  }
}
class Arr
{
  public static void main(String[] args)
  {
      int count=0,count1=0;
      int a[]={7, 10, 10, 15, 15, 15, 15, 10,10, 10, 15, 10, 10};
      for(int val:a)
      {
          if(val==10)
             count++;
          else
          {
               count1=Math.max(count,count1);
               count=0;
          }
          count1=Math.max(count,count1);
      }
      System.out.println(count1);
   }
}
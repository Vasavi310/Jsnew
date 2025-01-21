import java.util.*;
interface Sortable
{
    void sort(int a[]);
}
class Bubblesort implements Sortable
{
    public void sort(int a[])
    {
       int n=a.length;
       for(int i=0;i<n-1;i++)
       {
          for(int j=0;j<n-i-1;j++)
          {
               if(a[j]>a[j+1])
               {
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }
          }
     }
  }
}
class Selectionsort implements Sortable
{
   public void sort(int a[])
   {
      int n=a.length;
      for(int i=0;i<n;i++)
      {
         int x=i;
         for(int j=i+1;j<n-1;j++)
         {
           if(a[j]<a[x])
            x=j;
         }
         int temp=a[i];
         a[i]=a[x];
         a[x]=temp;
     }
  }
  public static void main(String[] args)
  {
     int a[]={2,3,7,6,5,9};
     Selectionsort obj=new Selectionsort();
     obj.sort(a);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }
     System.out.println();
     Bubblesort obj1=new Bubblesort();
     obj1.sort(a);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }
   }
}
      
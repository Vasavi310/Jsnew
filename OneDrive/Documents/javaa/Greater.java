import java.util.*;
class Greater<T extends Number & Comparable<T>>
{
  private T a,b,c;
  Greater(T a,T b,T c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public T display()
  {
      if(a.compareTo(b)>0 && a.compareTo(c)>0)
         return a;
      else if(b.compareTo(c)>0)
          return b;
      else
         return c;
  }
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     Greater<Integer> obj=new Greater<>(a,b,c);
     System.out.println(obj.display());
  }
}
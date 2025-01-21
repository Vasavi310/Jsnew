class Genericm
{
  T a,b;
  Genericm(T a,T b)
  {
    this.a=a;
    this.b=b;
  }
  public<T> void display(Sample<T> T)
  {
     System.out.println(a+" "+b);
  }
  public static void main(String[] args)
  {
    Genericm<Integer> obj=new Genericm<>(1,10);
    display(obj);
  }
} 
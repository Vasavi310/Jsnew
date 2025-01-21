class Genericc<T>
{
  T a,b;
  Genericc(T a,T b)
  {
    this.a=a;
    this.b=b;
  }
  public static<T> void display(Genericc<T> obj)
  {
     System.out.println(obj.a+" "+obj.b);
  }
  public static void main(String[] args)
  {
    Genericc<Integer> obj=new Genericc<>(1,10);
    display(obj);
  }
} 
class Boundt<T extends Number>
{
  T m;
  Boundt(T m)
  {
    this.m=m;
  }
  public T display()
  {
    return m;
  }
  public static void main(String[] args)
  {
     Boundt<Integer> obj=new Boundt<>(1);
     System.out.println(obj.display());
  }
}
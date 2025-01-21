class Boundmult<T extends A & B>
{
  T a;
  Boundmult(T a)
  {
    this.a=a;
  }
  public void runn()
  {
    this.a.display();
  }
}
interface B
{
  public void display();
}
class A implements B
{
   public void display()
   {
       System.out.println("inside a");
   }
}

class Bounmul
{
  public static void main(String[] args)
  {
    Boundmult<A> obj=new Boundmult<>(new A());
    obj.runn();
  }
}
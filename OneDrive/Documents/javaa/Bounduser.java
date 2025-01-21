class Boundus<T1 extends A & C>
{
  T1 a;
  Boundus(T1 a)
  {
    this.a=a;
  }
  public void runn()
  {
    this.a.display();
  }
 }
class A implements C
{
  public void display(){
  System.out.println("inside class A");
}}
class B extends A
{
  public void display(){
     System.out.println("inside B");
}}
interface C
{
  public void display();
}
class Bounduser
{
  public static void main(String[] args)
  {
    Boundus<B> obj1=new Boundus<>(new B());
    obj1.runn();
    Boundus<A> obj3=new Boundus<>(new A());
    obj3.runn();
  }
}
     
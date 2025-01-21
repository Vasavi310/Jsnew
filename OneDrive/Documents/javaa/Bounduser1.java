class Boundus<T1 extends A, T2 extends C>
{
  T1 a;
  T2 c;
  
  Boundus(T1 a, T2 c)
  {
    this.a = a;
    this.c = c;
  }
  
  public void runn()
  {
    this.a.display();
  }
}

class A
{
  public void display()
  {
    System.out.println("inside class A");
  }
}

class B extends A
{
  public void display()
  {
    System.out.println("inside B");
  }
}

class C extends A
{
  public void display()
  {
    System.out.println("inside C");
  }
}

class Bounduser1
{
  public static void main(String[] args)
  {
    Boundus<B, A> obj1 = new Boundus<>(new B(), new A());
    obj1.runn();
    
    Boundus<C, A> obj3 = new Boundus<>(new C(), new A());
    obj3.runn();
  }
}
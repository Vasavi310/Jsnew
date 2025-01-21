import java.util.*;
abstract class Person
{
   abstract void eat();
   abstract void exercise();
}
class Athelete extends Person
{
   public void eat()
   {
      System.out.println("athelete eats much");
   }
   public void exercise()
   {
      System.out.println("athelete sleeps little");
   }
}
class LazyPerson extends Person
{
   public void eat()
   {
      System.out.println("lazyperson doesnot eat much");
   }
   public void exercise()
   {
      System.out.println("lazyperson sleeps alot");
   }
   public static void main(String[] args)
   {
       Athelete obj1=new Athelete();
       obj1.eat();
       obj1.exercise();
       LazyPerson obj=new LazyPerson();
       obj.eat();
       obj.exercise();
   }
}
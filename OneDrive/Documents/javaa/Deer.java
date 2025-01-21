import java.util.*;
abstract class Animal
{
   abstract void eat();
   abstract void sleep();
}
class Lion extends Animal
{
   public void eat()
   {
      System.out.println("lion eats flesh");
   }
   public void sleep()
   {
       System.out.println("lion sleeps very less time");
   }
}
class Tiger extends Animal
{
   public void eat()
   {
      System.out.println("tiger eats flesh");
   }
   public void sleep()
   {
       System.out.println("tiger also sleeps very less time");
   }
}
class Deer extends Animal
{
   public void eat()
   {
      System.out.println("deer eats grass");
   }
   public void sleep()
   {
       System.out.println("deer sleeps in night");
   }
   public static void main(String[] args)
   {
      Lion obj1=new Lion();
      obj1.eat();
      obj1.sleep();
   }    
}
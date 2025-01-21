import java.util.*;
abstract class Vehicle
{
   void start()
   {
       System.out.println("vehicle start");
   }
   void stop()
   {
      System.out.println("vehicle stop");
   }
}
class Car extends Vehicle
{
   public void start()
   {
      System.out.println("car started");
   }
   public void stop()
   {
      System.out.println("car stopped");
   }
}
class Motorcycle extends Vehicle
{
   public void start()
   {
      System.out.println("motorcycle started");
   }
   public void stop()
   {
      System.out.println("motorcycle stopped");
   }
   public static void main(String[] args)
   {
       Car obj=new Car();
       obj.start();
       obj.stop();
       Motorcycle obj1=new Motorcycle();
       obj1.start();
       obj1.stop();
   }
}
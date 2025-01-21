import java.util.*;
class Vehicle
{
   String name;
   String colour;
   Vehicle(String name,String colour)
   {
      this.name=name;
      this.colour=colour;
   }
   public void drive()
   {
       System.out.println("vehicle name ="+name+" "+"color= "+colour);
   }
}
class Car extends Vehicle
{
   public Car(String name,String colour)
   {
       super(name,colour);
    }
   public void drive()
   {
       System.out.println("repairing a car");
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String name=sc.next();
      String colour=sc.next();
      Vehicle obj=new Vehicle(nme
      Car obj=new Car(name,colour);
      obj.drive();
   }
}
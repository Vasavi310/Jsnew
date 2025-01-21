import java.util.*;
abstract class Shape
{
   abstract double getarea();
  abstract double getperimeter();
}
class Circle extends Shape
{
   double r;
   Circle(int r)
   {
      this.r=r;
   }
   double getarea()
   {
       return (3.14*r*r);
   }
   double getperimeter()
   {
      return (2*3.14*r);
   }
}
class Rectangle extends Shape
{
   double a,b;
   Rectangle(double a,double b)
   {
      this.a=a;
      this.b=b;
   }
   double getarea()
   {
       return (a*b);
   }
   double getperimeter()
   {
       return (2*(a+b));
    }
}
class Triangle extends Shape
{
   double a,b,c;
   Triangle(double a,double b,double c)
   {
      this.a=a;
      this.b=b;
      this.c=c;
   }
   double getarea()
   {
       return (0.5*b*c);
   }
   double getperimeter()
   {
      return (a+b+c);
   }
   public static void main(String[] args)
   {
       Circle obj=new Circle(5);
       double res1=obj.getarea();
       System.out.println(res1);
       double res2=obj.getperimeter();
       System.out.println(res2);
        Triangle obj1=new Triangle(1,2,3);
        double res3=obj1.getarea();
       System.out.println(res3);
       double res4=obj1.getperimeter();
       System.out.println(res4);
       Rectangle obj2=new Rectangle(5,10);
    }  
}
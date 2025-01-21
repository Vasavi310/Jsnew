import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Course
{
   int cid();
   String name();
   int cost();
}
class Student
{
    int sid;
    String sname;
    double perc;
    Student(int sid,String sname,double perc)
    {
       this.sid=sid;
       this.sname=sname;
       this.perc=perc;
    }
   public void display()
   {
      System.out.println(sid+ " "+sname+" "+perc);
   }
}

class Student1
{
     @Course(cid=2,name="pandu",cost=175000)
   public void display1()
   {
      try{
       Class <? extends Student1>cls=this.getClass();
       Method m=cls.getMethod("display1");
       Course a=m.getAnnotation(Course.class);
        System.out.println(a.cid()); 
        System.out.println(a.name());
       System.out.println(a.cost());
     }
     catch(NoSuchMethodException m)
     {
         System.out.println(m);
     }
  }
}
class Stumain
{
   public static void main(String[] args)
   {
      Student obj=new Student(10,"shraddha",98);
       obj.display();
      Student1 obj1=new Student1();
       obj1.display1();
   }
}
       
    
   
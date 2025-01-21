import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Course
{
   int cid();
   String cname();
   int ccost();
}
@Course(cid=1,cname="cse",ccost=2000)
class Cost
{
   public void display()
   {
      System.out.println("the given details are");
      Course obj=Cost.class.getAnnotation(Course.class);
      System.out.println(obj.cid()+" "+obj.cname()+" "+obj.ccost());
   }
   public static void main(String[] args)
   {
      Cost c=new Cost();
      c.display();
   }
}
       
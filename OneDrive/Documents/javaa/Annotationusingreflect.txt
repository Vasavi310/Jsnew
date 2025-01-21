import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface Anno
{
   String key();
   String value();
}
class Annotation1
{
   @Anno(key="hi",value="good morning")
   public void dis()
   {
     try{
       Class <? extends Annotation1>cls=this.getClass();
       Method m=cls.getMethod("dis");
       Anno obj=m.getAnnotation(Anno.class);
       System.out.println(obj.key());
       System.out.println(obj.value());
     }
     catch(NoSuchMethodException a)
     {
         a.printStackTrace();
     }
   }
   public static void main(String[] args)
   {
       Annotation1 obj=new Annotation1();
       obj.dis();
   }
}
       
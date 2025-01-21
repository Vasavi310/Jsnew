import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface Anno1
{
    int id();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Anno2
{
    int id();
    String name();
}
class Annotationall
{
    @Anno1(id=1)
    @Anno2(id=2,name="cutie")
    public void display()
    {
        try{
        Class <? extends Annotationall>cls=this.getClass();
        Method m=cls.getMethod("display");
        Annotation[] a=m.getAnnotations();
        for(Annotation an:a)
           System.out.println(an);
        }
        catch(Exception e)
        {
           System.out.println("exception has raised");
        }
   }
        public static void main(String[] args)
        {
            Annotationall obj=new Annotationall();
            obj.display();
        }
    
}
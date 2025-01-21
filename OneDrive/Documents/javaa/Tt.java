class Threada extends Thread
{
   public void run()
   {
      try{
       System.out.println("THread"+Thread.currentThread().getId()+" is running");}
      catch(Exception a)
      {
         System.out.println("exception raised");
      }
   }
}
public class Threadt
{
   public static void main(String[] args)
   {
      for(int i=0;i<8;i++)
      {
         Threada obj=new Threada();
         obj.start();
      }
   }
}
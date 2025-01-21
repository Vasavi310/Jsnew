interface Printable
{
   void print();
}
interface Showable
{
   void show();
}
class Multipleinh implements Printable,Showable
{
   public void print()
   {
      System.out.println("hi");
   }
   public void show()
   {
      System.out.println("hello");
   }
   public static void main(String[] args)
   {
       Multipleinh obj=new Multipleinh();
       obj.print();
       obj.show();
   }
}

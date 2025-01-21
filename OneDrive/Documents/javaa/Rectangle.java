class Shape
{
   public void area()
   {
      System.out.println("area");
   }
   public void perimeter()
   {
      System.out.println("perimeter");
   }
}
class Rectangle extends Shape
{
  int l,b;
  Rectangle(int l,int b)
  {
     this.l=l;
     this.b=b;
  }
  public void area()
  {
     int area=(l*b);
     System.out.println(area);
  }
  public void perimeter()
  {
     int per=2*(l+b);
     System.out.println(per);
  }
  public static void main(String[] args)
  {
     Shape p;
     p=new Rectangle(10,2);
     p.area();
     p.perimeter();
  }
}
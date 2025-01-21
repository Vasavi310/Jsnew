package MCA;
public class Student
{
   private String name;
   private int m1,m2,m3;
   public Student(String name,int m1,int m2,int m3)
   {
      this.name=name;
      this.m1=m1;
      this.m2=m2;
      this.m3=m3;
   }
   public int getm1()
   {
      return m1;
   }
    public int getm2()
   {
      return m2;
   }
   public int getm3()
   {
      return m3;
   }
   public void display()
   {
      System.out.println(name);
   }
}

      
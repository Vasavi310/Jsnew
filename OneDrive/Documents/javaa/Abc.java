package Mca;
public class StudentA
{
   public int roll;
   public String name;
   public int m1,m2,m3;
   public StudentA(int roll,String name,int m1,int m2,int m3)
   {
      this.roll=roll;
      this.name=name;
      this.m1=m1;
      this.m2=m2;
      this.m3=m3;
    }
    public void display()
    {
      System.out.println("roll"+roll);
      System.out.println("name= "+name);
      int marks=m1+m2+m3;
      System.out.println("marks= "+marks);
      float avg=(float)(m1+m2+m3)/3;
      System.out.println("avg="+avg);
    }
}
import Mca.StudentA;
class Abc
{
  public static void main(String[] args)
  {
     StudentA obj1=new StudentA(1,"pandu",98,99,99);
     obj1.display();
   }
}
import java.util.*;
class Student1
{
    int roll;
    String name;
    Student1(int roll,String name)
    {
       this.roll=roll;
       this.name=name;
    }
    public void display()
    {
        System.out.println("name= "+name+" "+"roll= "+roll);
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int roll=sc.nextInt();
       String name=sc.next();
       Student1 obj=new Student1(roll,name);
       obj.display();
    }
}
     
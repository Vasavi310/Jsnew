import java.util.*;
import java.io.*;
class Student implements Serializable
{
   int c,java,python,t;
   String name;
   int roll;
   float cgpa;
   Student(int roll,String name,int c,int java,int python)
   {
      this.roll=roll;
this.name=name;
this.c=c;
this.python=python;
this.java=java;
this.t=this.roll+this.java+this.python;
this.cgpa=(float)this.t/30;
}
}
class Sdemo
{
   public static void main(String[] args)throws IOException,ClassNotFoundException
   {
int c,java,python,t;
   String name;
   int roll;
   float cgpa;
Scanner sc=new Scanner(System.in);
ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file1.txt"));
String s[]=new String[]{"roll","name","c","java","python","cgpa"};
oos.writeObject(s);
      int n=sc.nextInt();
for(int i=0;i<n;i++)
{
      roll=sc.nextInt();
      name=sc.next();
       c=sc.nextInt();
      java=sc.nextInt();
      python=sc.nextInt();
      Student obj4=new Student(roll,name,c,java,python);
      oos.writeObject(obj4);
}
ObjectInputStream f1=new ObjectInputStream(new FileInputStream("file1.txt"));
String[] a=(String[])f1.readObject();
for(String x:a)
{
   System.out.print(x+" ");
}
System.out.println();
for(int i=0;i<n;i++)
{
   Student obj=(Student)f1.readObject();
   System.out.println(obj.roll+" "+obj.name+" "+obj.c+" "+obj.java+" "+obj.python+" "+obj.cgpa);
}
}
}
      
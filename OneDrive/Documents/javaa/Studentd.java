import java.util.*;
class Studentd
{
   String name;
   double m1,m2,m3,m4,m5,m6;
   Studentd(String name,double m1,double m2,double m3,double m4,double m5,double m6)
   {
      this.name=name;
      this.m1=m1;
      this.m2=m2;
      this.m3=m3;
      this.m4=m4;
      this.m5=m5;
      this.m6=m6;
   }
   public double display(int n)
   {
         System.out.println("name "+name);
         double avg=(m1+m2+m3+m4+m5+m6)/6;
         System.out.println("avg= "+avg);
         return avg;
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          System.out.println("enter name");
          String name=sc.next();
          Double m1=sc.nextDouble();
          Double m2=sc.nextDouble();
          Double m3=sc.nextDouble();
          Double m4=sc.nextDouble();
          Double m5=sc.nextDouble();
          Double m6=sc.nextDouble();
          Studentd obj=new Studentd(name,m1,m2,m3,m4,m5,m6);
          double res=obj.display(n);
          if(res<0 || res>100)
             System.out.println("invalid");
          else if(res>=80)
            System.out.println("distinction");
          else if(res>=70 && res<80)
            System.out.println("first class");
          else if(res>=50 && res<70)
            System.out.println("pass");
          else if(res<50)
             System.out.println("fail");
      }
   }
}
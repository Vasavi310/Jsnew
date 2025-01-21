package MCA;
class Studentpack
{
   String name;
   int m1,m2,m3;
   Studentpack(String name,int m1,int m2,int m3)
   {
      this.name=name;
      this.m1=m1;
      this.m2=m2;
      this.m3=m3;
   }
   int getm1()
   {
      return m1;
   }
   int getm2()
   {
      return m2;
   }
   int getm3()
   {
      return m3;
   }
   public void display()
   {
       System.out.println("name="+name);
   }
}


      
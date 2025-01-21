class Employee
{
   String name;
   double hra;
   double mi;
   double tax;
   Employee(String name,double hra,double mi,double tax)
   {
       this.name=name;
       this.hra=hra;
       this.mi=mi;
       this.tax=tax;
   }
   public void calsal()
   {
      System.out.println("calculating salaries");
   }
}
class Manager extends Employee
{
   Manager(String name,double hra,double mi,double tax)
   {
       super(name,hra,mi,tax);
   }
   public void calsal()
   {
      double gross=hra+mi-tax;
      System.out.println(gross);
   }

}
class Prog extends Employee
{
  Prog(String name,double hra,double mi,double tax)
  {
     super(name,hra,mi,tax);
  }
  public void calsal()
  {
      double gross=hra+mi-tax;
      System.out.println(gross);
   }
   public static void main(String[] args)
   {
      Manager obj=new Manager("haas",200000,50000,25000);
      Prog obj1=new Prog("bool",250000,50000,20000);
      obj.calsal();
      obj1.calsal();
   }
}
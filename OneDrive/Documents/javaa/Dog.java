class Dog
{
   private String name;
   public int age;
   public String breed;
   Dog(String name,int age,String breed)
   {
      this.name=name;
      this.age=age;
      this.breed=breed;
   }
   Dog(String name,int age)
   {
      this.name=name;
      this.age=age;
      this.breed="unknown";
   }
   void display1()
   {
      System.out.println(name+" "+age+" "+breed);
   }
   void display2()
   {
       System.out.println(name+" "+age+" "+breed);
   }
   public static void main(String[] args)
   {
       Dog obj=new Dog("cheeku",3,"lab");
       Dog obj2=new Dog("leo",5);
       obj.display1();
       obj2.display2();
   }
}
class Throw1
{
   int test(int n1,int n2)
   {
      try{
      return n1/n2;
      }
      catch(ArithmeticException a)
     {
        throw a;
     }
   }
   public static void main(String[] args)
   {
     Throw1 obj=new Throw1();
     try{
        obj.test(1,0);
     }
     catch(Exception a)
     {
        a.printStackTrace();
     }
  }
}
  
      
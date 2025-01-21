import MCA.Student;
class Main1
{
   public static void main(String[] args)
   {
      Student obj=new Student("henry",98,99,99);
      int sum=obj.getm1()+obj.getm2()+obj.getm3();
      double avg=sum/3;
      obj.display();
   }
}
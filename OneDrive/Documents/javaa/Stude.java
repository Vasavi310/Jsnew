import MCA.Studentpack;
class Stude
{
   public static void main(String[] args)
   {
      Studentpack s=new Studentpack("sharada",98,99,99);
      s.display();
      int res=s.getm1()+s.getm2()+s.getm3();
      double avg=(res)/3;
      System.out.println(avg);
   }
}
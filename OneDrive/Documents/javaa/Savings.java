import java.util.*;
class Bankacco
{
  Scanner sc=new Scanner(System.in);
  int amount=200000;
  public static int balance;
  Bankacco(int balance)
  {
     this.balance=balance;
  }
  public void withdraw(int amount)
  {
     if(amount<balance)
     {
         balance-=amount;
         System.out.println(balance);
     }
     else
        System.out.println("not sufficient balance");  
  }
  public void deposit(int amount)
  {
    balance=balance+amount;
    System.out.println(balance);
  }
  public int getbalance()
  {
     return balance;
  }
}
class Savings extends Bankacco
{
   Savings(int balance)
   {
       super(balance);
   }
   public void withdraw(int amount)
   {
       if(getbalance()-amount<100)
           System.out.println("less than 100");
        else
           super.withdraw(amount);
   }
   public static void main(String[] args)
   {
      Savings obj=new Savings(300000);
      
       obj.withdraw(50000);
       obj.withdraw(300000);
       obj.deposit(300000);
       obj.withdraw(250000);
   }
}
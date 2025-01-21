import java.util.*;
class BankAccount
{
   double amount;
   static public double balance;
   BankAccount(double balance)
   {
      this.balance=balance;
   }
   public void deposit(double amount)
   {
      if(amount>0)
      {
          balance=balance+amount;
      }
      System.out.println("after depositing"+balance);
   }
   public void withdraw(double amount)
   {
       if(amount<balance)
       {
          balance=balance-amount;
          System.out.println("after withdrawing"+balance);
       }
       else
         System.out.println("insufficient balance");
   }
   double balance()
   {
       return balance;
   }
}
class SavingsAccount extends BankAccount
{
      public SavingsAccount(double balance)
      {
          super(balance);
      }
      @Override
      public void withdraw(double amount)
      {
          if(balance()-amount<100)
          {
               System.out.println("fails to withdraw");
          }
          else
             super.withdraw(amount);
      }
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          balance=sc.nextDouble();
          SavingsAccount obj=new SavingsAccount(balance);
          double amount=sc.nextDouble();
          //obj.deposit(amount);
          obj.withdraw(amount);
       }
}
    
         
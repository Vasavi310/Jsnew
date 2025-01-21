class BankAccount
{
   private double balance;
   BankAccount(double balance1)
   {
      this.balance=balance1;
   }
   void deposit(double amount)
   {
       if(amount>0)
        {
            balance=balance+amount;
            System.out.println("After deposition "+balance);
        }
   }
   void withdraw(double amount)
   {
       if(amount<=balance){
          balance=balance-amount;System.out.println(balance);}
   }
   double getbalance()
   {return balance;}
}
class Savingsaccount extends BankAccount
{
   Savingsaccount(double balance1)
   {
      super(balance1);
   }
   @Override
   void withdraw(double amount)
   {
      if(getbalance()-amount>=100)
          super.withdraw(amount);
      else{
        System.out.println("cannot retrieve money"); }
   }
}
class Banka
{
   public static void main(String[] args)
   {
       BankAccount obj=new Savingsa
ccount(200);
       obj.deposit(50);
       obj.withdraw(35);
       obj.withdraw(250);
   }
}
       
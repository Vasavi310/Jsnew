class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        BankAccount account = new SavingsAccount(200);
        
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(50);
        account.withdraw(30);
        account.withdraw(150); // This withdrawal will be denied due to the minimum balance constraint

        System.out.println("Final Balance: $" + account.getBalance());
    }
}
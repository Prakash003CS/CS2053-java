abstract class Account {
    String accNo;
    double balance;

    Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void display() {
        System.out.println("Account: " + accNo + " | Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accNo, double balance) { super(accNo, balance); }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; }
}

class CurrentAccount extends Account {
    CurrentAccount(String accNo, double balance) { super(accNo, balance); }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= (amt + 10); } }

public class prog4 {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("S001", 5000);
        Account a2 = new CurrentAccount("C001", 8000);

        a1.deposit(1000); a1.withdraw(2000); a1.display();
        a2.deposit(2000); a2.withdraw(3000); a2.display();
    }
}

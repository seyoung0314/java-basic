package chap1_7.inherit.example.bank;

public class Main {
    public static void main(String[] args) {

        SavingsAccount mySavingAccount
                = new SavingsAccount("A001", 5000, 0.1);

        mySavingAccount.deposit(10000);
        mySavingAccount.withdraw(10,"USD");

        mySavingAccount.displayBalance();

        BankAccount bankAccount
                = new BankAccount("B001", 60000);
    }
}

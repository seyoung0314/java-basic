package chap1_8.practice.q3;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public void printBalance() {
        System.out.println("계좌 잔액: " + this.getBalance() + "원");
    }
}

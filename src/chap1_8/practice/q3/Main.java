package chap1_8.practice.q3;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingAccount(10000,0.5);
        BankAccount checking = new CheckingAccount(10000,1000);

        savings.deposit(2000);
        checking.withdraw(6000);

        savings.printBalance();
        checking.printBalance();
    }
}

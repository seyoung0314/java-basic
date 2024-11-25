package chap1_3.Bankaccount;

public class BankAccount {
    String accountNumber;
    String owner;
    double balance;

    BankAccount(String accNum, String name) {
        accountNumber = accNum;
        owner = name;
        balance = 0;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("금액을 확인해주세요.");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance <= amount) {
            System.out.printf("\n잔액부족\n잔액 : %s\n", (int) balance);
            return;
        }
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("잔액 : " + (int) balance);
    }
}

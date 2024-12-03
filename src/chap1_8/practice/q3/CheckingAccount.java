package chap1_8.practice.q3;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("출금 실패: 잔액이 부족합니다.");
        }
    }
}

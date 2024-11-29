package chap1_3.practice.Bankaccount;

public class BanckAccountMain {
    public static void main(String[] args) {
        BankAccount kim = new BankAccount("111-222-333333","김철수");
        kim.deposit(5000000);
        kim.displayBalance();

        kim.withdraw(40000);
        kim.displayBalance();

        kim.withdraw(5000000);
    }
}

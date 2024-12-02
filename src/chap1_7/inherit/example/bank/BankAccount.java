package chap1_7.inherit.example.bank;

public class BankAccount {

    private String accountNumber; // 계좌 번호
    private double balance; // 잔액

    // 생성자
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 예금 메서드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금 완료: " + amount + "원");
        }
    }

    // 출금 메서드
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("출금 완료: " + amount + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 오버로딩된 출금 메서드
    public void withdraw(double amount, String currency) {
        // 통화 단위에 따른 환율 계산 로직 추가 가능
        if (currency.equals("USD")) {
            amount = amount * 1400; // 예시로 환율을 1200원으로 가정
        }
        withdraw(amount); // 기본 출금 메서드 호출
    }

    // 잔액 조회 메서드
    public void displayBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }
}

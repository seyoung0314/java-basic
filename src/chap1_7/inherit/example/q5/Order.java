package chap1_7.inherit.example.q5;

public class Order {
    public String orderId;
    protected double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public void process(){
        System.out.println("주문이 처리되었습니다.");
    }
}

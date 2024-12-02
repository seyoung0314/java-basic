package chap1_7.inherit.example.q5;

public class OnlineOrder extends Order{
    private double deliveryFee;

    public OnlineOrder(String orderId, double amount, double deliveryFee) {
        super(orderId, amount);
        this.deliveryFee = deliveryFee;
    }

    public void process(){
        System.out.println("온라인 주문이 처리되었습니다.");
    }
    public double calculateToAmount(){
        return super.amount + deliveryFee;
    }
}

package chap1_7.inherit.example.q5;

public class Main {
    public static void main(String[] args) {
        Order b001 = new Order("B001",20000);
        OnlineOrder a001 = new OnlineOrder("A001", 50000, 3000);

        int totalAmount = (int) a001.calculateToAmount();
        int amount = (int) b001.amount;

        b001.process();
        System.out.println("amount = " + amount);

        a001.process();
        System.out.println("totalAmount = " + totalAmount);
    }
}

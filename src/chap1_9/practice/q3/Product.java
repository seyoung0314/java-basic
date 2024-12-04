package chap1_9.practice.q3;

public class Product {
    private String productName;
    private long price;
    private static final double DISCOUNT_RATE = 0.1; //대문자로 작성

    public Product(String productName, long price) {
        this.productName = productName;
        this.price = price;
    }

    public void getProductInfo() {
        System.out.println("===============================================");
        System.out.printf("\n%s의 가격은 %d입니다\n", this.productName, this.price);
    }

    public void getDiscountedPrice() {
        double displayPrice = this.price - this.price * DISCOUNT_RATE;
        System.out.println("===============================================");
        System.out.printf("\n%s의 할인된 가격은 %.0f입니다\n", this.productName, displayPrice);
    }
}

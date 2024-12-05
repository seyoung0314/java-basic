package chap2_3.generic;

public class Main {
    public static void main(String[] args) {
        //사과바구니 생성

        AppleBasket appleBasket = new AppleBasket();
        appleBasket.setApple(new Apple(10));
        Apple apple = appleBasket.getApple();
        System.out.println("apple = " + apple);

        BananaBasket bananaBasket = new BananaBasket();
        bananaBasket.setBanana(new Banana(7));
        Banana banana = bananaBasket.getBanana();
        System.out.println("banana = " + banana);

        // 제네릭을 사용하면 바구니를 만들 떄
        // 어떤과일의 바구니인지 생성 시 정할 수 있음

        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple(13));
        Apple apple2 = ab.getFruit();
        System.out.println("apple2 = " + apple2);

        Basket<Banana> bb = new Basket<>();
        bb.setFruit(new Banana(5));
        Banana banana2 = bb.getFruit();
        System.out.println("banana2 = " + banana2);

        Basket<Peach> pb = new Basket<>();
        pb.setFruit(new Peach());

//        Basket<Cat> cb = new Basket<>();
//        cb.setFruit(new Cat());


    }
}

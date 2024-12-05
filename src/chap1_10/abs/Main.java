package chap1_10.abs;

public class Main {
    public static void main(String[] args) {

        // abstract 클래스라서 객체생성불가
//        Pet pet = new Pet();  // 추상적인 객체

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        Pet[] petList = {myCat, myDog, new Ham()};

        for (int i = 0; i < petList.length; i++) {
            Pet pet = petList[i];
            pet.eat();
        }
    }
}

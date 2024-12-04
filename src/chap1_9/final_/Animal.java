package chap1_9.final_;


class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("오버라이드된 메서드");
    }
}

public class Animal {

    public void eat() {
        System.out.println("밥");
    }

    public void makeSound() {
        System.out.println("동물 울음소리");
    }

}

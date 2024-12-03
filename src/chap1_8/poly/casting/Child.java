package chap1_8.poly.casting;

public class Child extends Parent{

    int c1;

    @Override
    void parentMethod(){
        System.out.println("오버라이드 child 메서드 1");
    }

    void childMethod(){
        System.out.println("child의 단독 메서드");
    }
}

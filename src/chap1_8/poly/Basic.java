package chap1_8.poly;


// 이렇게 외부에 클래스를 만들진 않지만 편의상
class A {
}

class B extends A{
}

class C extends A{
}

class D extends B{
}

class E extends C{
}

public class Basic {
    public static void main(String[] args) {

        // 다형성 : 객체가 다양한 형태를 가지고 있는 성질
        //          다양한 타입을 사용할 수 있다.
        //          (부모의 타입을 사용할 수 있음 - 상속관계 시)

//A : type       생성자
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        A x4 = new D();
        A x5 = new E();
    }
}

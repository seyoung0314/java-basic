package chap1_6.modi.pac1;

public class B {

    // 같은 패키지 내 다른 클래스 A 호출
    B(){
        A a = new A();  //public
        new A (10);  //default
//        new A (10.22);  //private - 접근불가

        a.f1 = 10;
        a.f2 = 11;
//        a.f3 = 12;  //private - 접근불가

        a.m1();  //public
        a.m2();  //default
//        a.m3();  //private - 접근불가
    }
}

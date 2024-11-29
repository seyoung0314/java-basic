package chap1_6.modi.pac2;

import chap1_6.modi.pac1.A;

public class C {

    // 다른 패키지의 다른 클래스 호출
    C() {
        A a = new A();  //public
//        new A(10);  //default - 접근불가
//        new A (10.22);  //private - 접근불가

        a.f1 = 10;
//        a.f2 = 11; - 접근불가
//        a.f3 = 12;  //private - 접근불가

        a.m1();  //public
//        a.m2();  //default - 접근불가
//        a.m3();  //private - 접근불가
    }
}

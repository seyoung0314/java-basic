package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

// protected : 다른 패키지의 접근을 차단,
// 단 상속관계에 있다면 부분적으로 허용
public class D extends A{

    D(){
//        super("aa");    // default 접근불가
        super(10);  // protected 접근가능

        // 둘이 같음
        super.f1 = 10;
//        this.f1 = 10;   // protected 접근가능

//        this.f2 = 20;   // default 접근불가

        this.m1();  // protected 접근가능
//        this.m2();  // default 접근불가

    }
}

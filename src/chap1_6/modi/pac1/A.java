package chap1_6.modi.pac1;

// class 에는 접근제한을 public 과 default 만 적용가능
public class A {
    // 필드
    public int f1;
    int f2;  // default 제한자
    private int f3;

    // 생성자
    public A() {
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }

    A(int a) {  // default 제한자
    }

    private A(double a) {
    }

    // 메서드
    public void m1() {
    }

    void m2() { // default 제한자
    }

    private void m3() {
    }

}

package chap1_7.protected_.pac1;

public class A {

    protected int f1;
    int f2;



    public A() {
    }

    protected A(int a) {
    }

    A(String s) {
    }



    protected void m1() {
    }

    void m2() {
    }

    void test() {
        f1 = 10;
        f2 = 20;
        m1();
        m2();
        new A();
        new A(10);
        new A("a");
    }
}

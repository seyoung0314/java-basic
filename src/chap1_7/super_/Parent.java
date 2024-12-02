package chap1_7.super_;

public class Parent {
    public int a;
    public double b;

    public Parent() {
        System.out.println("Parent 생성자 호출");
        this.a = 15;
        this.b = 20.5;
    }

    public void superMethod(){
        System.out.println("parent a = " + this.a);
        System.out.println("parent b = " + this.b);
    }
}

package chap1_9.static_;

public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c1.y = 10;
        c2.y++;
        c3.y = 2;

        c1.x = 99;
        c2.x = -98;
        // 클래스로 바로 접근 가능
        Count.x = 5000;

        System.out.println("c1 = " + c1.y);
        System.out.println("c2 = " + c2.y);
        System.out.println("c3 = " + c3.y);
        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("c3.x = " + c3.x);

        Count.m1();
        c1.m2();
    }
}

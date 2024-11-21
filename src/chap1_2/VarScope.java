package chap1_2;

public class VarScope {
    public static void main(String[] args) {
        // 자바의 변수는 변수가 선언된 블록에서만 사용가능
        int x1 = 10;
        if (true) {
            int x2 = 20;
            System.out.println("x2 = " + x2);
        }
        int x2 = 30;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}

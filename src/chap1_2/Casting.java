package chap1_2;

public class Casting {
    public static void main(String[] args) {
        // 타입 캐스팅

        // 묵시적 형변환:
        // 작은 데이터 타입에서 큰 데이터 타입에 넣을 때는 자동변환
        byte a = 100;
        int b = a;  // 100
        System.out.println("b = " + b);

        // 명시적 형변환 
        int c = 1000;
        byte d = (byte) c;   // -24
        System.out.println("d = " + d);
        // : 바이트단위로 잘려서 데이터 손상이 생길 수 있음

        int k = 50;
        double j = k;   // 50.0
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int) m;  // 5
        System.out.println("n = " + n);

        //묵시적 형변환 -> upcasting (promotion)
        //명시적 형변환 -> downcasting  

        // 타입이 다른 연산의 경우 큰 쪽에 맞춰서 자동 캐스팅
        int v = 100;
        double z = 6.6;
        double result = v + z;

        int i = 'A' + 4;
        System.out.println("i = " + i);

        int i1 = 27 / 5;
        System.out.println("i1 = " + i1);

        int h = 5;
        double v1 = 27 / (double) h;
        double v2 = 27 / 5.0;
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        // int보다 작은 데이터의 연산은 모두 강제로 int로 변환됨
        byte b1 = 100;
        byte b2 = 20;
        int i2 = b1 + b2;
    }
}
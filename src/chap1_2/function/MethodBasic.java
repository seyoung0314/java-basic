package chap1_2.function;

import java.util.Arrays;

public class MethodBasic {

    // 두 개의 정수를 전달받아 그 합을 반환하는 함수
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    // 두 개의 정수를 전달받아 그 곱을 콘솔에 출력하는 함수
    // void 함수는 리턴이 없어서 변수에 저장 불가능
    static void pringMultiply(int n1, int n2) {
        int result = n1 * n2;
        System.out.printf("%d x %d = %d", n1, n2, result);
        System.out.println();
    }

    // n개의 정수를 전달받아 그 총합을 반환하는 함수
    static int addAll(int... numbers) {
//    static int addAll(int[] numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 두 개의 정수를 전달받아 그 사칙연산의 4가지의 결과를 반환
    static int[] operate(int n1, int n2) {
        // ctrl + alt + v/n
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    // 정의 위치는 반드시 클래스 내부, 다은 메서드 외부여야함
    // 중첩함수  x
    public static void main(String[] args) {
        int r1 = add(10, 2);
        System.out.println("r1 = " + r1);
        pringMultiply(10, 20);

        int r2 = addAll(new int[]{1, 2, 3, 4, 5});
        System.out.println("r2 = " + r2);
        int r3 = addAll(1, 2, 3, 4, 50);
        System.out.println("r3 = " + r3);

        int[] r4 = operate(10, 2);
        System.out.println("r4 = " + Arrays.toString(r4));
    }
}

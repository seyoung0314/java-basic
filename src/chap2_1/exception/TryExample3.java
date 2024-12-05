package chap2_1.exception;

import chap1_9.util.InputUtil;

public class TryExample3 {
    public static void main(String[] args) {
        int age = InputUtil.inputInt("나이를 입력하세요 : ");
        System.out.println("age = " + age);

        System.out.println("종료");
    }
}

package chap1_6.practice;

import java.util.Scanner;

public class Common {
    static Scanner sc;

    public Common(){
        sc =  new Scanner(System.in);
    }
    // 입력을 쉽게 처리해주는 메서드
    public static String prompt(String message) {
        System.out.printf("%s ", message);
        return sc.nextLine();
    }
}

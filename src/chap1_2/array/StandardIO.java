package chap1_2.array;

import java.io.IOException;
import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) throws IOException {
        // 자바의 출력
//        System.out.println(123);

        // 자바의 입력
//        int read = System.in.read(); // 아스키 코드로 저장
//        System.out.println(read);

        Scanner sc = new Scanner(System.in);
        // 입력 처리
        System.out.print("글자를 입력하세요.");
        String data = sc.nextLine();
        System.out.println(data);

        // 정수 입력 처리
        System.out.print("숫자를 입력하세요.");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println(age);


    }
}

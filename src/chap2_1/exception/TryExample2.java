package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("정수 1 : ");
            String str1 = scanner.nextLine(); // 정수를 문자열로 입력받음
            int n1 = Integer.parseInt(str1);  // 문자열 정수를 정수로 반환


            System.out.println("정수 2 : ");
            String str2 = scanner.nextLine(); // 정수를 문자열로 입력받음
            int n2 = Integer.parseInt(str2);  // 문자열 정수를 정수로 반환

            int result = n1 / n2;
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {
            /*
                Exception : 예외의 메타데이터를 저장하는 클래스
             */
//            System.out.println(e.getMessage());
//            e.printStackTrace(); // 예외 상황에서 나오는 로그를 볼 수 있음

            System.out.println("정수를 정확히 입력해주세요.");

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(" 프로그램 정상 종료");
    }
}

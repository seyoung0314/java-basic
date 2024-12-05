package chap2_1.exception;

public class TryExample1 {
    public static void main(String[] args) {

        try {  // 예외가 발생할 가능성이 있는 코드
            // try 내부의 코드 실행 중에 예외가 발생하면 즉시 catch로 이동해 처리
            int n1 = 10;
            int n2 = 0;

            System.out.println("나눗셈 시작");

            int result = n1 / n2;

            System.out.printf("%d / %d = %d\n", n1, n2, result);

        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("나눗셈 종료");
    }
}

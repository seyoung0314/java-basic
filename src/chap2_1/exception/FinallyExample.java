package chap2_1.exception;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pets = {"강아지", "고양이", "카나리아"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + "키울래요");
                System.out.println("화이팅");
            } catch (Exception e) {
                System.out.println("그런 동물은 없어요");
            } finally {
                // 예외가 안나도 실행, 나도 실행
                // 일반적으로 메모리 정리 때 사용
                System.out.println("finally");
            }
        }
        System.out.println("End========");
    }
}

package chap2_3.generic;

public class Compare {
    // 제네릭 메서드: 최소값 찾기
    public static <T extends Comparable<T>> T min(T a, T b, T c) {
        T minValue = a;

        if (b.compareTo(minValue) < 0) {
            minValue = b;
        }
        if (c.compareTo(minValue) < 0) {
            minValue = c;
        }
        return minValue;
    }

    public static void main(String[] args) {
        // 정수형 데이터의 최소값
        System.out.println("정수의 최소값: " + min(3, 7, 5));

        // 문자열형 데이터의 최소값 (사전 순으로 비교)
        System.out.println("문자열의 최소값: " + min("사과", "바나나", "체리"));
    }
}

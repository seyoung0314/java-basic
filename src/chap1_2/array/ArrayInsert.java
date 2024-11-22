package chap1_2.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 90, 100, 150};

        int targetIndex = 2;
        int newNumber = 70;

        // 1. 사이즈가 1 큰 배열을 생성 후 기존 데이터를 모두 복시
        int[] temp = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        // 2. 마지막 데이터부터 시작해서 한 칸씩 뒤로 복사
        for (int i = temp.length-1; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        // 3. 2번 인덱스에 값을 새로운 값으로 수정
        temp[targetIndex] = newNumber;
        numbers = temp;
        temp = null;

        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}

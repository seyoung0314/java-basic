package chap1_2.array;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int newNumber = 50;

        // 1. 기존 배열 사이즈보다 1개 더 큰 사이즈의 배열을 생성
        int[] newArray = new int[numbers.length + 1];

        // 2. 원본 배열의 데이터를 새 배열로 복사 (인덱스는 그대로)
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        // 3. 새 배열의 끝 인덱스에 새 데이터 수정
        newArray[newArray.length - 1] = newNumber;

        // 4. 원본의 주소에 사본의 주소를 할당
        // 그래서 push,add 하면 원본의 주소가 변경됨
        numbers = newArray;
        newArray = null;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newArray));

    }
}

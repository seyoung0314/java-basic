package chap1_2.array;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // pop : 배열의 맨 끝 데이터를 삭제하며 반환

        // 1. 기존 사이즈보다 1개 작은 새 배열 생성
        int[] temp = new int[numbers.length - 1];

        // 2. 새 배열에 맨 끝 데이터만 빼고 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }

        // 3. 삭제될 데이터 백업
        int deleteTarget = numbers[numbers.length - 1];

        // 4. 주소값 변환
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(temp));
        System.out.println(deleteTarget);

        System.out.println(numbers);
        System.out.println(temp);
    }
}

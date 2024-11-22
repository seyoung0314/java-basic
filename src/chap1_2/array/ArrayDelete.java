package chap1_2.array;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;

        //배열의 사이즈를 줄이기 전에 삭제 대산부터 뒤에 데이터를
        // 앞으로 한 칸씩 당겨야함
//        numbers[2] = numbers[3];
//        numbers[3] = numbers[4];
//        numbers[4] = numbers[5];

        for (int i = targetIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        // 맨 마지막 pop
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
        temp = null;

        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}

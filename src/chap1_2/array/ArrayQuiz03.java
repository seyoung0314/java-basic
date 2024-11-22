package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        while (true) {
            if(tvxq.length == 0){
                System.out.println("다지움");
                return;
            }
            System.out.println("삭제할 사람의 이름을 입력하세요.");
            String input = sc.nextLine();
            int index = -1;

            for (int i = 0; i < tvxq.length; i++) {
                if (tvxq[i].equals(input)) {
                    index = i;
                }
            }

            for (int i = index; i < tvxq.length - 1; i++) {
                tvxq[i] = tvxq[i + 1];
            }

            String[] temp = new String[tvxq.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = tvxq[i];
            }
            tvxq = temp;

            System.out.println(Arrays.toString(tvxq));
        }
    }
}

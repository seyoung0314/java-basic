package chap1_2.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        //  이차원 배열
        // [[1,2,3],[4,5,6],[7,8,9]]  // length = 3
        int[] scoreKim = {77, 100, 99};
        int[] scorePack = {100, 22, 99};
        int[] scoreAn = {40, 90, 80};

        int[][] classScore = {scoreKim, scorePack, scoreAn};

        System.out.println(scoreKim[0]);
        System.out.println(Arrays.deepToString(classScore));
        System.out.println(Arrays.toString(classScore));
        System.out.println(classScore[1][0]);

        System.out.println("============================");

        int[][] arr2d = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
        };
        // for..of문
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.println("n = " + n);
            }
            System.out.println();
        }
        System.out.println("=======================");

        int[][] arr32 = new int[3][2];
        System.out.println(Arrays.deepToString(arr32));
    }
}

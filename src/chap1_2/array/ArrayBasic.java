package chap1_2.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        /*
            Java 배열의 특징
            1. 동종 모음 구조 :  같은 타입의 데이터만 저장 가능
            2. 크키가 불변 : 크기를 동적으로 늘이거나 줄일 수 없음
        */
        // 배열 만들기
        // 1. 배열 변수 만들기
        int[] numbers;  // numbers의 메모리(주소) 할당용량 -> 8byte

        // 2. 배열 객체 생성하기
        numbers = new int[5];
        System.out.println("numbers = " + Arrays.toString(numbers));

        // 3. 배열 값 초기화
        numbers[0] = 50;
        numbers[1] = 10;
        numbers[2] = (int) 63.2;
        numbers[3] = numbers[0] - 3;
        numbers[4] = 2;

        // 4. 배열 값 확인하기
        System.out.println(Arrays.toString(numbers));

        // 5. 배열 길이 확인하기
        System.out.println(numbers.length);

        // 6. 배열의 순회
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
            System.out.printf("numbers[%d]: %d", i, numbers[i]);
        }
        System.out.println("================================");

        // 배열 전용 반복문 : foreach, inhanced doe loop
        for (int n : numbers) {
            System.out.println("n = " + n);
        }
        System.out.println("================================");

        // 배열 생성 단축 문법
        String[] pets = new String[]{"강아지", "고양이", "햄스터"};
        System.out.println(Arrays.toString(pets));

        // 배열 변수 선언과 동시에 초기화할 때는 ne Type[] 생략가능
        String[] foods = {"햄버거", "바나나"};
        System.out.println(Arrays.toString(foods));

        System.out.println("================================");

        /*
        자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
        정수형 : 0
        실수형 : 0.0
        논리형 : false
        문자형 : ''
        기타(String) : null
         */

        int[] points = new int[4];
        double[] doubles = new double[3];
        boolean[] booleans = new boolean[3];
        char[] chars = new char[2];
        String[] strings = new String[4];
        Math[] maths = new Math[2];

        System.out.println(points.length);   //4
        System.out.println(Arrays.toString(points));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(maths));
    } // end main
}

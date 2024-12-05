package chap2_2;

import chap1_8.practice.q1.Shape;

public class Wrapper {
    public static void main(String[] args) {
        String s = new String(new char[] {'a','b','c'});
        // boxing : 긴 문법을 단축해줌
        String str = "abc";

        int a = 10;  // 기본값 : 0
        Integer i = new Integer(10);
        Integer b = 10;  // 기본값 : null

        //  Wrapper 의 목적 : 원시타입을 제거
        Byte x1 = 10;
        Short x2 = 10;
        Integer x3 = 10;
        Long x4 = 10L;
        Float x5 = 10F;
        Boolean x6 = true;
        Character x7 = 'A';


        System.out.println("i = " + i);
        System.out.println("s = " + s);


    }
}

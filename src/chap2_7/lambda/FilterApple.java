package chap2_7.lambda;


import chap2_7.lambda.basic.GenericPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {
    /**
     * @param basket : 다양한 사과들이 들어있는 리스트
     * @return - 필터링된 사과들을 새 리스트에 담아 리턴
     * @solution - try1 : 색상이 녹색
     * @problem - 만약에 다른 색상의 사과를 필터링해야한다면??
     * 이 메서드만으론 불가능...
     */
    public static List<Apple> filterGreenApple(List<Apple> basket) {

        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 녹색 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @param basket : 다양한 사과들이 들어있는 리스트
     * @param color  : 원하는 색상
     * @return - 필터링된 사과들을 새 리스트에 담아 리턴
     * @solution - try2 : 색상을 파라미터화 하여 필터링
     * @problem - 만약에 필터링 기준이 색상이 아니라면??
     * 이 메서드만으론 불가능...
     */
    public static List<Apple> filterAppleByColor(List<Apple> basket, Color color) {

        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 특정 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    // 메서드를 파라미터화 가능? -> 자바는 불가능
    // 함수를 전달할 수 없는 대신 객체를 전달하여 그 객체 안에 함수를 호출하는 형식

    /**
     * @solution - try3 : 동작(기능,메서드)을 추상화시켜 파라미터화
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate f) {

        //shift + F6 - 변수명 한번에 변경
        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> filteredBasket = new ArrayList<>();


        // 2. 반복문과 조건문을 통해 특정 사과를 필터링
        for (Apple apple : basket) {
            if (f.filter(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try4 : 여러객체들을 필터링 할 수 있도록 제네릭사용
     */
    public static <T> List<T> filterGeneric(List<T> list, GenericPredicate<T> option) {
        List <T> filteredList= new ArrayList<>();
        for (T t : list) {
            if(option.filter(t)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}

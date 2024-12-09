package chap2_7.lambda;

import chap2_6.inner.AppleWeightPredicate;

import java.time.Instant;
import java.time.Year;
import java.util.List;
import java.util.function.BiFunction;

import static chap2_7.lambda.Color.*;

public class Main {
    public static void main(String[] args) {

        List<Apple> appleBasket = List.of(
                new Apple(10, RED)
                , new Apple(12, GREEN)
                , new Apple(14, RED)
                , new Apple(10, GREEN)
                , new Apple(20, GREEN)
                , new Apple(15, RED)
                , new Apple(11, RED)
                , new Apple(10, YELLOW)
                , new Apple(18, YELLOW)
                , new Apple(25, YELLOW)
        );
        List<Apple> filterGreenApple = FilterApple.filterGreenApple(appleBasket);
        System.out.println("filterGreenApple = " + filterGreenApple);
        System.out.println("filterGreenApple.size() = " + filterGreenApple.size());

        System.out.println("=========================");

        List<Apple> redApples = FilterApple.filterAppleByColor(appleBasket, RED);
        System.out.println("redApples = " + redApples);
        System.out.println("redApples.size() = " + redApples.size());

        System.out.println("=========================");

        List<Apple> filterAppleByWeight = FilterApple.filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("filterAppleByWeight = " + filterAppleByWeight);
        System.out.println("filterAppleByWeight.size() = " + filterAppleByWeight.size());

        System.out.println("=========================");

        List<Apple> filterInnerClass = FilterApple.filterApples(appleBasket, new AppleGreenOrRed());
        System.out.println("filterInnerClass = " + filterInnerClass);
        System.out.println("filterInnerClass.size() = " + filterInnerClass.size());

        System.out.println("=========================");

        // 익명클래스 사용
        ApplePredicate filterOption = new ApplePredicate() {
            @Override
            public boolean filter(Apple apple) {
                return apple.getWeight() > 15 && apple.getColor() == GREEN;
            }
        };

        List<Apple> filterAppleByOption = FilterApple.filterApples(appleBasket, filterOption);
        System.out.println("filterAppleByOption = " + filterAppleByOption);
        System.out.println("filterAppleByOption.size() = " + filterAppleByOption.size());

        System.out.println("=========================");
        List<Apple> dd = FilterApple.filterApples(appleBasket, new ApplePredicate(){
            @Override
            public boolean filter(Apple apple) {
                return apple.getWeight() > 15 && apple.getColor() == GREEN;
            }
        });
        System.out.println("dd = " + dd);
        System.out.println("dd.size() = " + dd.size());

        System.out.println("=========================");

        List<String> foods = List.of("짜장면", "김치찌개", "햄버거", "탕수육", "치즈버거");

//        @FunctionalInterface 라면 한줄로 단순화 가능
        List<String> filteredFood = FilterApple.filterGeneric(foods, food -> food.length() > 3);
        System.out.println("filteredFood = " + filteredFood);

        System.out.println("=========================");

        // 사과 색상만 뽑기
        List<Color> colorList = MappingApple.mappingApplesByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("=========================");

        List<Integer> mappedList = MappingApple.mappedApples(appleBasket, map-> map.getWeight());
        System.out.println("mappedList = " + mappedList);
    }

    // 내부 클래스 사용
    private static class AppleGreenOrRed implements ApplePredicate {

        @Override
        public boolean filter(Apple apple) {
            return apple.getColor() == RED || apple.getColor() == GREEN;
        }
    }
}

package chap2_8.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCaloriesMeats = Menu.menuList.stream()
                .filter(m -> m.getType() == DishType.MEAT)
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(Collectors.toList());

        lowCaloriesMeats.forEach(m -> System.out.println("m = " + m));

        System.out.println("=======================================");

        Menu.menuList.stream()
                .filter(m -> m.getType() == DishType.MEAT)
                .sorted(Comparator.comparing((Dish d) -> d.getName()).reversed())
                .collect(Collectors.toList())
                .forEach(n -> System.out.println("n = " + n));

        System.out.println("=======================================");

        Menu.menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .forEach(m -> System.out.println("m = " + m));
    }
}

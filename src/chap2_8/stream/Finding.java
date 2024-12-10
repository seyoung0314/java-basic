package chap2_8.stream;

import java.util.Optional;

import static chap2_8.stream.Menu.*;

public class Finding {
    public static void main(String[] args) {

        // 요리 중 채식주의자가 먹을 수 있는 요리가 하나라도 있는지 여부
        boolean flag = menuList.stream()
                .anyMatch(d -> d.isVegetarian());

        System.out.println("flag = " + flag);

        // 모든 요리가 800칼로리 미만인지?
        boolean flag2 = menuList.stream()
                .allMatch(d -> d.getCalories() < 800);

        System.out.println("flag2 = " + flag2);

        // 요리 중에 첫번째 발견된 생선 요리를 찾기
        Optional<Dish> first = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst();

        System.out.println("first = " + first);
    }
}

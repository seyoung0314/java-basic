package chap2_8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;
import static java.util.stream.Collectors.*;

// map : 리스트에서 원하는 데이터만 선택해서 추출
public class Mapping {
    public static void main(String[] args) {

        // 요리의 이름들만 추출해서 맵핑
        List<String> dishNameList = menuList.stream()
                .map(dish -> dish.getName())
                .collect(toList());

        System.out.println("dishNameList = " + dishNameList);

        System.out.println("=====================================");

        List<String> browsers = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> lengthList = browsers.stream()
                .map(b -> b.length())
                .collect(toList());

        System.out.println("lengthList = " + lengthList);

        System.out.println("=====================================");

        List<Character> characterList = browsers.stream()
                .map(b -> b.charAt(0))
                .collect(toList());

        System.out.println("characterList = " + characterList);

        System.out.println("=====================================");

        // 요리리스트에서 이름과 칼로리만 추출해서
        // 새로운 객체로 포장하여 배열에 담기
        List<Map<String, Object>> mapList = menuList.stream()
                .map(dish -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("menuName", dish.getName());
                    map.put("calories", dish.getCalories());
                    return map;
                })
                .collect(toList());
        System.out.println("mapList = " + mapList);

        System.out.println("=====================================");

//        List<SimpleDish> simpleDishes = menuList.stream()
//                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories()))
//                .collect(toList());

        List<SimpleDish> simpleDishes = menuList.stream()
//                .map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new)// JAVA18
                .collect(toList());

        simpleDishes.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 요리 중 500칼로리 이상의 메뉴이름들만 추출
        List<String> highCaloriesNames = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> dish.getName())
                .collect(toList());

        System.out.println("highCaloriesNames = " + highCaloriesNames);

        System.out.println("=====================================");

        List<Map<String, String>> highCaloriesNames2 = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> {
                    String stringType = "";
                    DishType type = dish.getType();
                    switch (type) {
                        case FISH:
                            stringType = "어류";
                            break;
                        case MEAT:
                            stringType = "육류";
                            break;
                        case OTHER:
                            stringType = "기타";
                            break;
                    }
                    ;
                    Map<String, String> map = new HashMap<>();
                    map.put("dishName", dish.getName());
                    map.put("type", stringType);
                    return map;
                })
                .collect(toList());

        highCaloriesNames2.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        Map<DishType, String> koreanType = new HashMap<>();
        koreanType.put(DishType.FISH, "어류");
        koreanType.put(DishType.MEAT, "육류");
        koreanType.put(DishType.OTHER, "기타");

        // 메뉴 리스트에서 칼로리가 500 이상인 Dish만 필터링하여, name과 type을 Map으로 반환
        List<Map<String, String>> highCaloriesNames3 = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> {
                    Map<String, String> map = new HashMap<>();
                    map.put("dishName", dish.getName());
                    // getOrDefault(key,defaultValue)
                    // : 키값에 대응하는 값을 반환, 키값이 없다면 기본값(defaultValue) 반환
                    map.put("type", koreanType.getOrDefault(dish.getType(), "기타"));
                    return map;
                })
                .collect(Collectors.toList());

        highCaloriesNames3.forEach(map -> System.out.println(map));

        System.out.println("=====================================");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> {
                    return new DishDetail(dish);
                })
                .collect(toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 요리의 총 칼로리 수 구하기
        int sum = menuList.stream()
                .mapToInt(dish -> dish.getCalories())
                .sum();

        System.out.println("sum = " + sum);

        System.out.println("=====================================");

        // 평균 칼로리 구하기
        double asDouble = menuList.stream()
                .mapToInt(dish -> dish.getCalories())
                .average()
                .getAsDouble();

        System.out.println("asDouble = " + asDouble);


    }
}

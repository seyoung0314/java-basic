package chap2_8.stream;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filtering {
    public static void main(String[] args) {

        //요리 메뉴중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> menuList = Menu.menuList;

//        // 채식주의자들의 요리를 담을 새 리스트 생성
//        List<Dish> vegetarianList = new ArrayList<>();
//        // 필터링
//        for (Dish dish : menuList) {
//            if (dish.isVegetarian()){
//                vegetarianList.add(dish);
//            }
//        }

        // 익명클래스 방식
//        List<Dish> vegetarianList = menuList.stream()
//                .filter(new Predicate<Dish>() {
//            @Override
//            public boolean test(Dish dish) {
//                return dish.isVegetarian();
//            }
//        }).collect(Collectors.toList());

        // 함수 표현식
        List<Dish> vegetarianList = menuList.stream()  //1. 데이터 소스생성
                .filter(dish -> dish.isVegetarian())  //2. 중간 연산
                .collect(Collectors.toList());  //3. 최종 연산

        // 반복문 처리 (forEach는 .stream()생략가능)
        vegetarianList.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 메뉴 목록 중 육류이면서 600칼로리 미만인 요리
        List<Dish> meatLowList = menuList.stream()
                .filter(dish -> dish.getType() == DishType.MEAT
                        && dish.getCalories() < 600).collect(Collectors.toList());

        meatLowList.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 메뉴 이름이 4글자 인것만 필터링
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                // JAVA8 문법
                .forEach(System.out::println);

        List<Dish> fourWordsList = menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList());

//        fourWordsList.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        List<Dish> limit3List = menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // 앞에서부터 3개 선택
                .collect(Collectors.toList());

        limit3List.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        // 300칼로리보다 높은 요리 중 처음 2개는 무시하고 필터링
        List<Dish> skip2List = menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 앞에서부터 2개 제외
                .collect(Collectors.toList());

        skip2List.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=====================================");

        List<Integer> numbers = List.of(1,2,1,3,3,2,4,4,4,1,2);

        // 숫자리스트에서 짝수들만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // 중복제거
        Set<Integer> SetEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());


        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복제거
                .collect(Collectors.toList());

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("SetEvenNumbers = " + SetEvenNumbers);
        System.out.println("evenNumbers2 = " + evenNumbers2);

        System.out.println("=====================================");


    }
}

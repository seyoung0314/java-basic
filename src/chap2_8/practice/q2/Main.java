package chap2_8.practice.q2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );


        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.

        System.out.println("#1");

        bookings.stream()
                .filter(b -> b.getYear() == 2022)
                .sorted(Comparator.comparing(Booking::getPrice))
//                .collect(Collectors.toList())

                .forEach(b -> System.out.println("b = " + b));

        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.

        System.out.println("==============================================");
        System.out.println("#2");

        bookings.stream()
                .map(b -> b.getDestination().getCountry())
                .distinct()
                .forEach(c -> System.out.println("c = " + c));

        // 연습 3: Paris에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.

        System.out.println("==============================================");
        System.out.println("#3");

        bookings.stream()
                .filter(b -> b.getDestination().getCity().equals("Paris"))
                .sorted(Comparator.comparing(b -> b.getTraveler().getName()))
                //내림차순
//                .sorted(Comparator.comparing((Booking booking) -> booking.getTraveler().getName()).reversed())
                .forEach(t -> System.out.println("t = " + t));

        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환.

        System.out.println("==============================================");
        System.out.println("#4");

        bookings.stream()
                .map(b -> b.getTraveler().getEmail())
                .sorted(Comparator.comparing(String::toString))
                .distinct()
                .forEach(e -> System.out.println("e = " + e));

        // 연습 5: Italy로의 여행이 한 건이라도 있는지 여부 확인.

        System.out.println("==============================================");
        System.out.println("#5");

        boolean result5 = bookings.stream()
                .map(b -> b.getDestination().getCountry())
                .anyMatch(Predicate.isEqual("Italy"));


        System.out.println("result5 = " + result5);

        // 연습 6: France로의 모든 여행의 총 가격을 출력.

        System.out.println("==============================================");
        System.out.println("#6");

        double result6 = bookings.stream()
                .mapToDouble(b -> {
                    if (b.getDestination().getCountry().equals("France")) {
                        return b.getPrice();
                    }
                    return 0;
                })
                .sum();
        System.out.println("result6 = " + result6);

        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?

        System.out.println("==============================================");
        System.out.println("#7");

        double result7 = bookings.stream()
                .mapToDouble(Booking::getPrice)
                .max()
                .orElse(0);

        System.out.println("result7 = " + result7);

        // 연습 8: 가장 저렴한 여행의 정보 탐색.

        System.out.println("==============================================");
        System.out.println("#8");

        double result8 = bookings.stream()
                .mapToDouble(Booking::getPrice)
                .min()
                .orElse(0);

        System.out.println("result8 = " + result8);

        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.

        System.out.println("==============================================");
        System.out.println("#9");

        bookings.stream()
                .filter(b -> b.getPrice() >= 2000)
                .forEach(b -> System.out.println("b = " + b));

        // 연습 10: 모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격을 계산하시오.

        System.out.println("==============================================");
        System.out.println("#10");

        double result10 = bookings.stream()
                .mapToDouble(Booking::getPrice)
                .sorted()
                .skip(1)
                .average()
                .orElse(0);

        System.out.println("result10 = " + result10);

        // 연습 11: 모든 여행자의 여행 예약을 여행지별로 그룹화하여 출력하시오.

        System.out.println("==============================================");
        System.out.println("#11");

        Set<Map.Entry<String, List<Booking>>> collect = bookings.stream()   // Stream<Booking>
                .sorted(comparing(b -> b.getTraveler().getEmail()))    // Stream<Booking>
                .collect(groupingBy(b -> b.getDestination().getCountry()))      // Map<String,List<Booking>>
                .entrySet()  // Set<Map.Entry<String, List<Booking>>>
                .stream()  // Stream<Map.Entry<String, List<Booking>>>
                .sorted(Map.Entry.comparingByKey())  // Stream<Map.Entry<String, List<Booking>>>
                .collect(Collectors.toSet());
//                .forEach((entry) -> {
//                    System.out.println(entry.getKey());
//                    entry.getValue().forEach(b -> System.out.println("b = " + b));
//                });


    }


}
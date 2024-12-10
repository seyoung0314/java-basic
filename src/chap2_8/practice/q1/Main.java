package chap2_8.practice.q1;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>

        System.out.println("#1");

        transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .forEach(t -> System.out.println("t = " + t));

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>

        System.out.println("==============================================");
        System.out.println("#2");

        List<String> result2 = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("result2 = " + result2);

        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>

        System.out.println("==============================================");
        System.out.println("#3");

        List<Trader> result3 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        result3.forEach(t -> System.out.println("t = " + t));

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차정렬하여 반환
        // List<String>

        System.out.println("==============================================");
        System.out.println("#4");

        List<String> tradersNameList = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted((a, b) -> a.compareTo(b))
//                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.toList());

        System.out.println("tradersNameList = " + tradersNameList);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?

        System.out.println("==============================================");
        System.out.println("#5");

        boolean result5 = transactions.stream()
                .anyMatch(c -> c.getTrader().getCity().equals("Milan"));

        System.out.println("result5 = " + result5);

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        System.out.println("==============================================");
        System.out.println("#6");

        int result6 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(v -> v.getValue())
                .sum();

        System.out.println("result6 = " + result6);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?

        System.out.println("==============================================");
        System.out.println("#7");

        int result7 = transactions.stream()
                .mapToInt(v -> v.getValue())
                .max()
                // optional 타입은 null를 위한거라 없을 경우
                // 기본값을 설정해주면 기본타입형으로 변경할 수 있다.
                .orElse(0);

        System.out.println("result7 = " + result7);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

        System.out.println("==============================================");
        System.out.println("#8");

        Optional<Transaction> result8 = transactions.stream()
                .sorted(comparing(Transaction::getValue))
                .findFirst();

        Transaction min = transactions.stream()
                .min(comparing(t -> t.getValue()))
                .orElse(null);

        System.out.println("min = " + min);
        System.out.println("result8 = " + result8.get());

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.

        System.out.println("==============================================");
        System.out.println("#9");

        transactions.stream()
                .filter(t -> t.getValue() > 500)
                .collect(Collectors.toList())
                .forEach(t -> System.out.println("t = " + t));

        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0

        System.out.println("==============================================");
        System.out.println("#10");


        OptionalDouble result10 = transactions.stream()
                .sorted(comparing(Transaction::getValue))
                .collect(toList())
                .subList(1, transactions.size())
                .stream()
                .mapToInt(Transaction::getValue)
                .average();

        System.out.println("result10 = " + result10.getAsDouble());

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */

        System.out.println("==============================================");
        System.out.println("#11");

        Map<Integer, List<Transaction>> result11 = transactions.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .collect(groupingBy(Transaction::getYear));

        System.out.println("result11 = " + result11);

        result11.forEach((year, tr) -> {
            System.out.println(year);
            tr.stream()
                    .map(t ->
                            new TranderQ11(t.getTrader().getName() + " in " + t.getTrader().getCity()
                                    , t.getYear(), t.getValue()))
                    .forEach(t -> System.out.println(t));
        });
        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700

        System.out.println("==============================================");
        System.out.println("#12");

        List<Transaction> result12List = transactions.stream()
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        int result12 = result12List.get(result12List.size() - 1).getValue()
                - result12List.get(0).getValue();

        System.out.println("result12 = " + result12);
    }


}
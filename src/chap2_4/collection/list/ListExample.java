package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // List - interface , ArrayList - class
        // 기본은 Object 타입 (제네릭) - 너무 광범위해서 문제가 생길 수 있음
//        List hobbies = new ArrayList();
//        hobbies.add("dddd");
//        hobbies.add(123);
//        hobbies.add(true);

//        List<String> hobbies = new ArrayList<String>();
        // 8버전부턴 뒤에 <>는 생략가능
        List<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("러닝");

        System.out.println("hobbies = " + hobbies);

        // 중간 삽입
        hobbies.add(2, "여행");
        System.out.println("hobbies = " + hobbies);

        // 데이터 수 확인하기
        int size = hobbies.size();
        System.out.println("size = " + size);

        // 인덱스 찾기
        int index1 = hobbies.indexOf("수영");
        int index2 = hobbies.indexOf("뮤지컬");
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

        // 요소 포함 여부
        boolean flag = hobbies.contains("수영");
        System.out.println("flag = " + flag);

        // 요소 삭제
        hobbies.remove("수영");
        System.out.println("hobbies = " + hobbies);
        hobbies.remove(1);
        System.out.println("hobbies = " + hobbies);

        // 요소 수정
        hobbies.set(0, "게임");
        System.out.println("hobbies = " + hobbies);

        // 요소 참조 (복사해서 반환)
        String hobby = hobbies.get(0);
        System.out.println("hobby = " + hobby);

        // 리스트의 순회 (반복문 처리)
//        for (int i = 0; i <hobbies.size() ; i++) {
//            System.out.println(hobbies.get(i));
//        }
        // forEach문 (iter)
        for (String s : hobbies) {
            System.out.println("s = " + s);
        }

        // 자바스트립트는 => 자바는 ->
        hobbies.forEach(h-> System.out.println("h = " + h));

        // 전체 삭제
        hobbies.clear();
        System.out.println("hobbies = " + hobbies);
        System.out.println(hobbies.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        System.out.println("numbers = " + numbers);
        numbers.add(100);
        System.out.println("numbers = " + numbers);



    }
}

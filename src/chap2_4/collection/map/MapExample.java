package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        //HashMap은 순서가 없음
        //순서가 있는애는 LinkedHashMap
        Map<String, Object> map = new HashMap<>();

        // 데이터 추가 : put
        map.put("empName", "김철수");
        map.put("hireDate", LocalDate.of(2012, 3, 15));
        map.put("salary", 5000000);

        System.out.println(map);
        System.out.println(map.size());

        // 맵에 있는 데이터 꺼내기
        // get() : Object 형식으로 반환되기 때문에 다운캐스팅 필요
        String empName = (String) map.get("empName");
        int salary = (Integer) map.get("salary");
        System.out.println("empName = " + empName);
        System.out.println("salary = " + salary);

        // 중복된 키를 사용해서 생성 시 수정으로 처리
        map.put("empName", "박영희");
        System.out.println("map = " + map);

        // 맵의 순회
        // iterable 을 상속받지 않았기 때문에 fori 불가
        Set<String> keys = map.keySet();  // map에서 key만 추출
        for (String key : keys) {
            System.out.println("key = " + key);
            System.out.println("map.get(key) = " + map.get(key));
        }

        Stack<Object> stack = new Stack<>();
        Queue<Object> queue = new LinkedList<>();
    }
}

package chap2_4.collection.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // Set - 중복을 허용하지 않고 순서가 없음

        Set<String> set = new HashSet<>();

        boolean flag1 = set.add("떡볶이");
        boolean flag2 = set.add("떡볶이");
        set.add("김밥");
        set.add("단무지");
        System.out.println("set = " + set);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);

        System.out.println("set.size() = " + set.size());

        // Set은 순서가 없기 때문에 index관련 메서드 불가
        set.remove("단무지");
        System.out.println("set = " + set);

        //fori문은 순서가 없어서 불가능
        for (String s : set) {
            System.out.println("s = " + s);
        }

        // set은 보통 데이터 중복을 빠르게 없앨 때 사용
        List<Integer> numbers
                = List.of(1, 2, 2, 3, 4, 54, 5, 6, 2, 3, 4, 1, 1);

        System.out.println("numbers = " + numbers);

        //set으로 변환
        Set<Integer> numset = new HashSet<>(numbers);
        System.out.println("numset = " + numset);

        // 다시 list로 변환
        numbers = new ArrayList<>(numset);
        System.out.println("numbers = " + numbers);

        System.out.println("===========================");

        Person p1 = new Person("김철수", "991122");
        Person p2 = new Person("박영희", "040405");
        Person p3 = new Person("김철수", "951024");
        Person p4 = new Person("김철수", "991122");

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        System.out.println("personSet = " + personSet);
    }
}

class Person {
    String name;
    String ssn; //주민번호

    public Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }


    // 객체의 리스트라면 .equals와 .hashCode를
    // 오버라이드하여 주소값을 같게 변경해주어야한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(ssn, person.ssn);
    }

    // equals에서 같다고 판정된 객체의 주소값을 통일시킴
    @Override
    public int hashCode() {
        return Objects.hash(name, ssn);
    }

}



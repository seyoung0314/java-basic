package chap2_8.compareator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("김철수", 15, 79));
        studentList.add(new Student("박영희", 13, 41));
        studentList.add(new Student("최민지", 17, 11));
        studentList.add(new Student("이영아", 19, 34));

        // 나이순으로 오름차순
//        studentList.sort((o1,o2)->o1.getAge() - o2.getAge());
        studentList.sort(comparing(stu -> stu.getAge()));
        studentList.forEach(s -> System.out.println("s = " + s));

        System.out.println("======================================");
        // 나이 - 내림차순
        studentList.sort(comparing(Student::getAge).reversed());
        studentList.forEach(s -> System.out.println("s = " + s));


    }
}

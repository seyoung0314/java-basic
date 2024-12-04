package chap1_9.final_;

public class Student {

    public  String name;
    public final String ssn;
    public static final String nation = "";

    //상수는 불변셩과 유일성을 만족해야 함
    // 따라서 final키워드는 분변성은 만족하나 유일성을 만족하지 못함

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

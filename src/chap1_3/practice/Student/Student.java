package chap1_3.practice.Student;

public class Student {
    int studentId;
    String name;
    int grade;

    Student(int sId, String sName, int sGrade) {
        studentId = sId;
        name = sName;
        grade = sGrade;
    }

    void updateGrade(int newGrade) {
        grade++;
    }

    void printStudentInfo() {
        System.out.println("ID : " + studentId);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
    }

}

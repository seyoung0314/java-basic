package chap1_3.practice.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student kim = new Student(24010101,"김철수",1);
        kim.updateGrade(2);
        kim.printStudentInfo();
    }
}


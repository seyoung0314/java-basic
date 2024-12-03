package chap1_9.depart;


public class Department {

    private String departmentName;
    private int studentCount;
    private static int totalStudentCount;

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudentCount += this.studentCount;
    }

    // 학생 수를 추가하는 메서드
    public void addStudent(int number) {
        this.studentCount += number;
        totalStudentCount += studentCount;
    }

    // 학과 학생 수를 조회하는 메서드
    public int getStudentCount() {
        return studentCount;
    }
    // 모든 학과 학생 수를 조회하는 메서드
    // 오버라이딩 불가능
    public static int getTotalStudentCount() {
        return totalStudentCount;
    }


}

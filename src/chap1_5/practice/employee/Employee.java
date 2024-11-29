package chap1_5.practice.employee;

public class Employee {
    String name;
    String position;
    double salary;

    public Employee() {
        this("이름","직급",2000000);
    }

    public Employee(String name, String position) {
        this(name,position,2000000);
    }

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 급여를 지정된 금액만큼 증가시키는 메서드
    void increaseSalary(double amount){

    }

}

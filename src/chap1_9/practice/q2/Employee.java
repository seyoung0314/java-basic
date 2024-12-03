package chap1_9.practice.q2;

public class Employee {
    private static int idCount = 1;
    private int employeeId;
    private String name;

    public Employee(String name) {
        this.name = name;
        this.employeeId = idCount;
        idCount++;
    }

    public void getEmployeeInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("ID : " + employeeId);
    }
}

package chap1_7.inherit.example.q1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("김빛나", 2000000);
        Manager manager1 = new Manager("최수정", 2000000, 500000);

        employee1.work();
        System.out.println("급여 : " + (int) employee1.getSalary());
        manager1.work();
        System.out.println("급여 : " + (int) manager1.getSalary());

    }
}

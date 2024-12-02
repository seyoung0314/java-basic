package chap1_7.inherit.example.q1;

public class Employee {
    public String name;
    //protected : 상속관계 사이에서만 사용가능
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void work(){
        System.out.println("일반직원 "+this.name+"이(가) 일합니다.");
    }

}

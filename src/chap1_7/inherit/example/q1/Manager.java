package chap1_7.inherit.example.q1;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getTotalCompensation(){
        double compensation = super.salary + this.bonus;
        return compensation;
    }

    @Override
    public double getSalary(){
        return this.salary+bonus;
    }
    @Override
    public void work(){
        System.out.println("관리자 "+this.name+"이(가) 팀을 관리합니다.");
        double compensation = getTotalCompensation();
    }
}

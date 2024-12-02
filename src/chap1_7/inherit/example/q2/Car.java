package chap1_7.inherit.example.q2;

public class Car {
    public String make;
    public String model;
    protected int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.printf("%s %s가 시동을 겁니다.\n",make,model);
    }
}

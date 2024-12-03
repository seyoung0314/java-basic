package chap1_9.practice.q1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("SM5",2013);
        Car car2 = new Car("GLS",2023);
        Car car3 = new Car("GV80",2021);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();

        Car.getTotalCars();
    }
}

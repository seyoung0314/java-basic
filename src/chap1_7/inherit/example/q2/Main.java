package chap1_7.inherit.example.q2;

import chap1_7.protected_.pac2.C;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("르노삼성","SM5",2014);
        ElectricCar electricCar
                = new ElectricCar("기아", "쏘렌토", 2023, 200000);

        car.start();
        electricCar.start();
        electricCar.displayRange();
    }
}

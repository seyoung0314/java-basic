package chap1_9.practice.q1;

public class Car {
    private String model;
    private int year;
    private static int count = 0;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }

    public void getCarInfo() {
        System.out.println("==========================");
        System.out.println("model : " + this.model);
        System.out.println("제조년도 : " + this.year);
    }

    public static void getTotalCars() {
        System.out.println("==========================");
        System.out.println("총 차량 수 : " + count);
    }
}


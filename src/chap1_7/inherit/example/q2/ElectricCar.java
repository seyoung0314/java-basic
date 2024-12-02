package chap1_7.inherit.example.q2;

public class ElectricCar extends Car{
    private double batteryCapacity;

    public ElectricCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void start(){
        System.out.printf("%s %s가 소리없이 시동을 겁니다.\n",make,model);
    }

    public void displayRange(){
        double range = batteryCapacity / 420;
        System.out.printf("%s %s의 예상 주행 거리는 %.2fkm 입니다.",make,model,range);
    }
}

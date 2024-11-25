package chap1_3.Vehicle;

public class VihicleMain {
    public static void main(String[] args) {
        Vehicle grandeur = new Vehicle("그랜져");
        grandeur.powerOn();
        grandeur.powerOn();
        System.out.println("========================");

        Vehicle panamere = new Vehicle("파나메라");
        panamere.powerOn();
        panamere.accelerate();
        panamere.accelerate();
        panamere.accelerate();
    }
}
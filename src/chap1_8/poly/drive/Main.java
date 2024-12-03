package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {
        Sonata sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        // 쏘나타를 배열에 저장
//        Sonata[] sonataList = {sonata1,sonata2,sonata3};

//        for (Sonata s : sonataList){
//            s.accel();
//        }
//

        Tucson tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tusanList = {tucson1,tucson2};

        Tesla tesla1 = new Tesla();
        Car tesla2 = new Tesla();
        Car tesla3 = new Tesla();
        Car tesla4 = new Tesla();

//        Tesla[] teslaList = {tesla1,tesla2,tesla3,tesla4};

        // 다형성을 통해 동종모음 구조배열을
        // 이종모음 형태로 구현할 수 있다.
        Car[] carList = {sonata3, tesla2, tucson1};
        for (Car c : carList) {
            c.accel();
        }
        System.out.println("=====================");

        Driver Kim = new Driver();
        Kim.drive(sonata1);
        Kim.drive(new Tesla());

        System.out.println("=====================");

        CarShop shop = new CarShop();
        Car car = shop.exportCar(6000);
        car.accel();

        System.out.println("=====================");

        Kim.drive(shop.exportCar(3000));

        System.out.println("---------------------");

        Sonata mySonata = new Sonata();
        mySonata.accel();
        mySonata.joinSonata();

        // 업캐스팅은 자동으로 되니까 수동으로는 하지말자
//        Car[] cars = {mySonata};

        System.out.println("---------------------");
        Sonata baughtCar = (Sonata) (shop.exportCar(3000));
        baughtCar.accel();
        baughtCar.joinSonata();
    }
}

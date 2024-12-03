package chap1_8.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 50;
        child.p1 = 200;

        child.parentMethod();
        child.childMethod();

        System.out.println("==================");

        Parent parent = new Parent();
        parent.p1 = 50;
//        parent.c1 = 40; //불가

        parent.parentMethod();
//        parent.childMethod();  //불가

        System.out.println("==================");

        // 두개가 비슷한 결 (upcasting)
        int a = 10;
        double x = a;
        Parent castingChild = new Child();
        castingChild.p1 = 100;

        System.out.println("castingChild = " + castingChild);
//        castingChild.c1 = 200;
        castingChild.parentMethod();
        // 타입의 업캐스팅은 자동처리 되며 자식의 속성과 기능을 사용하지는 못한다
        // 따라서 자식의 기능을 사용하려면 수동으로 다운캐스팅을 해야함
        ((Child)castingChild).childMethod();
        
    }
}

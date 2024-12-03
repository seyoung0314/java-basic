package chap1_9.static_;

public class Count {

    // 접근제한자 - 클래스,필드,메서드,생성자...(public..)
    // 사용제한자
    // static - 필드,메서드 (내부 클래스)
    // : 클래스가 로딩될 때 초기화, 객체생성 시 초기화  x
    // final -
    // abstract -

    // 정적 필드는 모든 객체가 공유하는 데이터
    public static int x;    // 정적필드
    public int y;   // 인스턴스 필드(동적)

    public Count() {
    }

    // 정적 메서드 : 모든 객체가 공유하는 기능
    //              객체 생성없이 호출가능
    public static void m1(){
        System.out.println("static method");
//        System.out.println(this);  // this가 없음

        // static 메서드 안에서는 인스턴스 필드 참조 불가
        System.out.println("x = " + x);
//        System.out.println("y = " + y); //불가
    }
    // 인스턴스 메서드
    //  : 호출 시 객체생성 필요
    public void m2(){
        System.out.println("instance method ");
    }

}

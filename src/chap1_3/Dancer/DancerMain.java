package chap1_3.Dancer;

public class DancerMain {
    public static void main(String[] args) {
        
        // class를 통해 객체(obj)를 찍어낸다.
        // = 클래스를 통해 인스턴스를 생성
        Dancer park = new Dancer();
        System.out.println("park = " + park);

        Dancer kim = new Dancer();
        System.out.println("kim = " + kim);

        //객체의 기능 사용 - 객체 참조 => 참조연산자 (.)
        park.dancerName = "박영희";
        park.crewName = "하이크루";
        park.dancelevel = 1;
        park.genres = new String[] {"힙합","스트릿"};

        park.dance();
        kim.dance();

        Dancer gong = new Dancer("공민지");
        gong.dance();

        Dancer happy = new Dancer("해피");
        happy.dance();
        happy.introduce();

//        Dancer hambugi = new Dancer("햄부기","치즈",new String[] {"aa", "bb"});
        Dancer hambugi = new Dancer("햄부기","치즈","aa", "bb");
        hambugi.introduce();
    }

}

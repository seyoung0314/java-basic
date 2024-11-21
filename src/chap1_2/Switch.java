package chap1_2;

public class Switch {
    public static void main(String[] args) {
        int a =10 ;
        double b = 5.5;
        String season = "여름";

        // switch 에 들어가는 변수의 타입은 정수형/문자형 만 가능
        switch (season){
            // csae에는 변수 지전 불가능, 상수, 리터럴만 가능
            case "봄":
                System.out.println("봄이네요.");
                break;
            case "여름":
                System.out.println("여름이네요.");
                break;
            case "가을":
                System.out.println("가을이네요.");
                break;
            case "겨울":
                System.out.println("겨울이네요.");
                break;
            default: break;
        }




    }
}

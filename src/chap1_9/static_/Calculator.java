package chap1_9.static_;

public class Calculator {

    String color;
    static double pi;

    // 계산기에 커스텀 색상을 추가하는 메서드
    void customColorize(String color){
        this.color = color;
    }

    // 원의 넓이 구하는 메서드
    double calcArea(int r){
        return r * r*pi;
    }
}

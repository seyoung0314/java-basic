package chap1_8.poly.computer;

public class Computer{
    KeyBoard keyBoard;

    // 다형성은 객체의 교환성을 높여주어
    // 객체가 특정 객체에 종속(의존)되지 않도록 하게 해준다.
    public void changeKeyBoard(KeyBoard keyBoard){
        this.keyBoard = keyBoard;
        System.out.println("키보드가 교체되었습니다.");
    }
}

package chap1_8.poly.computer;

public class Main{
    public static void main(String[] args) {
        Computer myCom = new Computer();
        // 초기에 내 컴퓨터의 키보드 세팅
        myCom.keyBoard = new SamsungKeyBoard();
        // 키보드 교체
        myCom.changeKeyBoard(new LgKeyBoard());
    }
}

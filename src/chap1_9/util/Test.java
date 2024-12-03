package chap1_9.util;

// import static : static 데이터를 참조
import static chap1_9.util.InputUtil.*;
import static chap1_9.util.InputUtil.inputStr;
import static java.lang.Math.*;

public class Test {

    double random = random();
    String name = inputStr("이름 : ");
    String address = inputStr("주소 : ");
    int age = inputInt("나이 : ");
}
package chap2_2.lang;

import java.util.Objects;

class Pen {
    long serial;  // 일련번호
    String color;
    int price;

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // Object 클래스의 메서드를 재정의
    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    // 모든 필드값이 같으면 같은 객체로 인식시키기

//        if (this == o) {
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }

    @Override
    public boolean equals(Object o) {
        boolean result;
        Pen target = (Pen) o;
        if (this.serial == target.serial
                && this.price == target.price
                && this.color == target.color) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}

public class ObjectSample {
    public static void main(String[] args) {
        Pen yellowPen = new Pen(100L, "노랑", 1000);
        Pen bluePen = new Pen(100L, "파랑", 1000);
        Pen bluePen2 = new Pen(100L, "파랑", 1000);

        System.out.println("yellowPen = " + yellowPen.toString());
        System.out.println("bluePen = " + bluePen.toString());

        System.out.println(" 두 펜이 같은가? " + (bluePen2 == bluePen));
        System.out.println(" 두 펜이 같은가? " + (bluePen2.equals(bluePen)));

    }
}

package chap1_3.Rectangle;

public class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    void calculateArea() {
        double result = width * height;
        System.out.printf("\n가로 %f 세로%f 사각형의 넓이는 %f입니다.\n",width,height,result);
    }

    void calculatePerimeter() {
        double result = (width + height)*2;
        System.out.printf("\n가로 %f 세로%f 사각형의 넓이는 %f입니다.\n",width,height,result);
    }
}

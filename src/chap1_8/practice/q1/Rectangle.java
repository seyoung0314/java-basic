package chap1_8.practice.q1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.type = "사각형";
    }

    @Override
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width * height * 2;
    }
}

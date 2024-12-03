package chap1_8.practice.q1;

public class Circle extends Shape {
    double pie;
    double radius;

    public Circle(double radius) {
        this.pie = 3.14;
        this.radius = radius;
        this.type = "원";
    }

    public double area() {
        return radius * radius * pie;
    }

    public double perimeter() {
        return radius * 2 * pie;
    }
}

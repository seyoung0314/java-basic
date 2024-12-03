package chap1_8.practice.q1;

public class ShapeManager{

    public void printShapeInfo (Shape shape) {
        System.out.printf("\n%s의 면적 : %.2f\n", shape.type, shape.area());
        System.out.printf("\n%s의 둘레 : %.2f\n", shape.type, shape.perimeter());
    }
}

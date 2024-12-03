package chap1_8.practice.q1;


public class Main {

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        Rectangle shapeR = new Rectangle(2, 4);
        Circle shapeC = new Circle(5);

        shapeManager.printShapeInfo(shapeC);
        shapeManager.printShapeInfo(shapeR);
    }

}

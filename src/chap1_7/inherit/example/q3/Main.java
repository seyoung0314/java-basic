package chap1_7.inherit.example.q3;

public class Main {
    public static void main(String[] args) {
       ScientificCalculator cal = new ScientificCalculator();

       int a = 2;
       int b = 3;

       cal.add(a,b);
       double resultPower = cal.power(a,b);
        System.out.printf("%d^%d = %.0f",a,b,resultPower);
    }
}

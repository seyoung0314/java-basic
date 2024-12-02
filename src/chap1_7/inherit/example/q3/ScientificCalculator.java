package chap1_7.inherit.example.q3;

public class ScientificCalculator extends Calculator {

    ScientificCalculator() {
        super();
    }

    public double power(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
            System.out.println("i = " + i);
            System.out.println("result = " + result);

        }
        return result;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("과학 계산기로 더하기 연산을 수행합니다.");
        return a + b;
    }
}

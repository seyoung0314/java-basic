package chap2_6.inner;

public class Main {

    // 내부클래스 (inner Class)
    private static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {
        AddCalculator addCal = new AddCalculator();
        int result = addCal.operate(1, 2);
        System.out.println("result = " + result);

        SubCalculator subCal = new SubCalculator();
        int result2 = subCal.operate(10, 3);
        System.out.println("result2 = " + result2);

        // 익명 클래스 (anonymous Class) : 객체생성해서 사용하고 폐기
        Calculator mulCal = new Calculator() {
            //                = new mulCalculator implements Calculator
            // 클래스 블록 내부
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        int result3 = mulCal.operate(2, 13);
        System.out.println("result3 = " + result3);

        Calculator divCal = (n1, n2) -> n1 / n2;

        int result4 = divCal.operate(100, 4);
        System.out.println("result4 = " + result4);

        System.out.println("=============================");

        Restaurant italian = new Restaurant() {
            private String ownerChefName;

            public void make() {

            }

            @Override
            public void cook() {
                System.out.println("이탈리안 레스토랑의 요리를 만듭니다.");
            }

            @Override
            public void reserve() {
                System.out.println("이탈리안 레스토랑의 예약을 받습니다.");

            }
        };
        italian.cook();
        italian.reserve();
    }
}

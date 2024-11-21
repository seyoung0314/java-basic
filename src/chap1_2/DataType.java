package chap1_2;

public class DataType {
    //main : 프로그램의 실행 기점
    public static void main(String[] args) {
        int i = 20;
        double v = 0.314;
        char c = '가';
        String s = "가나다";
        boolean b = true;

        // 정수 타입 (byte, short, int , long)
        byte x1 = 127;   // 1byte : -127~128
        short x2 = 32767;   // 2byte : -32766~32767
        int x3 = 2147483647; // 4byte

        // 정수 리터럴의 기본타입 : int
        long x4 = 21474836471111L; // 8byte
        System.out.println(x4);

        // 실수 타입
        float f1 = 3.14F;  // 4byte
        double f2 = 3.14;  // 8byte
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // 논리 타입
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        boolean b4 = (10 + 3 == 13) && (9 * 1 == 8);

        System.out.println(b4);
    
        // 문자와 문자열 타입
        char c1 = 'A'; // 2byte
        char c2 = 44032; // 가
        System.out.println("c2 = " + c2);

        char[] cArr = {'h','e','l','l','o'};
        String str = new String(cArr);
        System.out.println("cArr = " + str);
        
        String str2 = "안녕하세요";
        System.out.println("str2 = " + str2);
        
        // java17 부터 지원
        String str3 = """
                
                   멀티 스트링
                """;
        System.out.println("str3 = " + str3);

        // 동적 타이핑 : 안씀
        var z = 100; // 타입 추론
        var h = "가나아";
    }
}

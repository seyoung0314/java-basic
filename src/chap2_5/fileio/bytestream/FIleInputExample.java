package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputExample {

    public static void main(String[] args) {


//        FileInputStream fis = null;

        // try ~ with ~ resource (신 문법)
        // : 메모리 누수가 있을 수 있는 코드를 자동 해제
        try(FileInputStream fis
                    = new FileInputStream(FileExample.ROOT_PATH + "/pet.txt")) {

//            int data = fis.read();
//            System.out.println("data = " + data);
//            data = fis.read();
//            System.out.println("data = " + data);
//            data = fis.read();
//            System.out.println("data = " + data);

            int data = 0;
            while ((data = fis.read()) != -1) {
                // 아스키 코드를 문자로 출력
                System.out.write(data);
            }
            // 출력 버퍼 비우기
            System.out.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            // 예외에 관계없이 실행할 코드
//            try {
//                // 메모리 해제 - 누수방지
//                if(fis != null) fis.close();
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }



    }
}

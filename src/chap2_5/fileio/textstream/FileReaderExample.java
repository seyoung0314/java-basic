package chap2_5.fileio.textstream;

import chap2_5.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/hello.html")) {
//        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/hobby.txt")) {

            //텍스트를 라인 단위로 읽는 보조스트림
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String data = br.readLine();

                if (data == null) break;
                System.out.println(data);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

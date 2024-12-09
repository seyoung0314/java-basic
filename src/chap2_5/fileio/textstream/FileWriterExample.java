package chap2_5.fileio.textstream;

import chap1_9.util.InputUtil;
import chap2_5.fileio.FileExample;

import java.io.FileWriter;
import java.io.IOException;

/*
    바이트 기반 스트림 : 이미지,영상,텍스트 등 1바이트 단위로 입출력
      -> InputStream, OutPutStream..
    텍스트 기반 스트림 : 오직 텍스트만을 2바이트 단위로 입출력
      -> Reader, Writer..
 */
public class FileWriterExample {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter(FileExample.ROOT_PATH + "/hobby.txt")) {

            String hobby = InputUtil.inputStr("취미를 입력하세요 :" );

            // 파일 생성 명령
            fw.write("당신의 취미 : "+hobby);
            System.out.println("파일 저장에 성공했습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

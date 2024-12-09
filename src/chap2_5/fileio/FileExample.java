package chap2_5.fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 기본 경로 상수로 설정
    public static final String ROOT_PATH = "C:/fileUpload";

    public static void main(String[] args) throws IOException {

        //폴더 생성 명령
        //폴더를 파일 객체로 래핑
        File rootDirectory = new File(ROOT_PATH);

        // 폴더 생성하기
        if (!rootDirectory.exists()) { // 해당 경로가 존재하지 않는다면
            rootDirectory.mkdir();
        }

        //파일 생성하기
        //파일명을 파일 객체로 래핑
        File newFile = new File(ROOT_PATH + "/food.txt");

        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}

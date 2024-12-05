package chap2_1.exception;


public class LoginInvalidException extends Exception{
    // 생성자 2개

    // 기본생성자 : 에러메시지가 딱히 없는 경우
    public LoginInvalidException() {
    }

    // 에러메세지를 등록하는 생성자
    public LoginInvalidException(String message) {
        super(message);
    }
}

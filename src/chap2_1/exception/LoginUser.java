package chap2_1.exception;

public class LoginUser {
    private String account;
    private String password;

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 로그인 검증
    public void loginValidate(String inputAccount, String inputPassword)
        // throws : 예외처리가 필요한 메서드
            throws LoginInvalidException
    {
        // 계정검증
        if (!inputAccount.equals(this.account)) {
            /*
            프로그램에선 예외로 인식하지 않지만
            실제로 비지니스 상황에서는 예외로 인식시켜야 할 경우
            강제로 에러를 발생시켜야 함
             */

            // throw : 예외상황을 만들어서 던져줌 (메서드 상단에 표기 필수)
            throw new LoginInvalidException("아이디 불일치");
        }
        // 패스워드 검증
        if (!inputPassword.equals(this.password)) {
            throw new LoginInvalidException("비밀번호 불일치");
        }
        System.out.println("로그인에 성공했습니다.");

    }
}

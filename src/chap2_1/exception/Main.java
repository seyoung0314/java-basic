package chap2_1.exception;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("aaa", "1111");

        try {
            user.loginValidate("aaa", "111");
        } catch (LoginInvalidException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

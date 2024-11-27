package chap1_5.library;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book("해리포터");
        // .toString() -> class에 만들어놓으면 호출할 때 생략가능
        System.out.println(book1);

        Book book2 = new Book("듄","프랭크 허버트",1965);
        System.out.println(book2);
    }
}

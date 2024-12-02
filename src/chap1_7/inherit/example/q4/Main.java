package chap1_7.inherit.example.q4;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("해리포터", "조앤롤링");
        EBook eBook1 = new EBook("신곡","단테",500);

        book1.read();
        eBook1.read();
        eBook1.displayFileSize();
    }
}

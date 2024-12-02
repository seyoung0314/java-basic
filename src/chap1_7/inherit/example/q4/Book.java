package chap1_7.inherit.example.q4;

public class Book {
    public String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void read(){
        System.out.println("책을 읽습니다.");
    }
}

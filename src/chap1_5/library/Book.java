package chap1_5.library;

public class Book {
    String title; // 책 제목
    String author; // 저자명
    int year; //출판연도
    int n1, n2, n3;

    // 만약 클래스 안에 생성자를 하나도 안만들면
    // 자동으로 파라미터가 없는 기본 생성자를 만듬

    public Book(String title) {
//        this.title = title;
//        this.author = "미상";
//        this.year = 2024;
        //this() -> 나의 다른 생성자 호출
        //!!무조건 첫줄에 작성되어야 함
        this(title,"미상",2024);
        System.out.println("1번"+title);
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("2번"+title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    void add1(int n1, int n2) {
//        this.n1 = n1;
//        this.n2 = n2;
//        this.n3 = 100;
        add2(n1, n2, 100);
    }

    void add2(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
}

package chap1_3.practice.Library;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    void searchBook(String title){
        for(Book book : books){
            if(book.title.equals(title)) {
                book.printInfo(title);
                return;
            }
        }
        System.out.println("없는 도서입니다.");
    }
}

class Book {
    String title;
    String bookNumber;
    String author;
    String[] genre;
    boolean available;

    public Book(String title, String bookNumber, String author, boolean available, String... genre) {
        this.title = title;
        this.bookNumber = bookNumber;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    void printInfo(String title) {
        System.out.println("번호 : " + bookNumber);
        System.out.println("제목 : " + this.title);
        System.out.println("저자 : " + author);
        System.out.println("장르 : " + Arrays.toString(genre));
        if (available) {
            System.out.println("대출 가능");
        } else {
            System.out.println("대출 불가능");
        }
    }
}
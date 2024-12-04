package chap1_9.enum_.practice.q5;

public class Main {
    public static void main(String[] args) {
        LibraryBook libraryBook = new LibraryBook("해리포터", "조앤롤링", GENRE.FICTION);

        libraryBook.printInfo();
    }
}

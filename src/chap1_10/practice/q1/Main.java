package chap1_10.practice.q1;

public class Main {

    public static void main(String[] args) {
        Ebook ebook = new Ebook
                ("해리포터", "조앤롤링", 1783);
        PrintedBook printedBook = new PrintedBook
                ("동물농장", "조지오웰", 320);

        ebook.displayInfo();
        System.out.println("==========================");
        printedBook.displayInfo();
    }
}

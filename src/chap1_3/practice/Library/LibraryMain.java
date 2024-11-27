package chap1_3.practice.Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("주홍색연구", "0001", "아서코난도일", true, "추리", "범죄");
        Book book2 = new Book("데미안", "0002", "헤르만헤세", true, "철학", "심리");
        Book book3 = new Book("동물농장", "0003", "조지오웰", true, "우화");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.searchBook("주홍색연구");
    }
}

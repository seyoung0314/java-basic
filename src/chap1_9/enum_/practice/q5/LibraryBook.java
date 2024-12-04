package chap1_9.enum_.practice.q5;

public class LibraryBook {
    private String title;
    private String author;
    private GENRE genre;

    public LibraryBook(String title, String author, GENRE genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void printInfo(){
        System.out.printf("\n제목 : %s",title);
        System.out.printf("\n저자 : %s",author);
        System.out.printf("\n장르 : %s",genre.getKorean());
    }
}

package chap1_10.practice.q1;

public class Ebook extends Book{
    private int fileSize;

    public Ebook(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\n제목 : %s",title);
        System.out.printf("\n저자 : %s",author);
        System.out.printf("\n파일 크기 : %s\n",fileSize);
    }
}

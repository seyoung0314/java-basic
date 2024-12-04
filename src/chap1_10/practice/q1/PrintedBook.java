package chap1_10.practice.q1;

public class PrintedBook extends Book{

    private int pageCount;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\n제목 : %s",title);
        System.out.printf("\n저자 : %s",author);
        System.out.printf("\n페이지 수 : %d\n",pageCount);
    }
}

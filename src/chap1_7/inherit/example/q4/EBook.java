package chap1_7.inherit.example.q4;

public class EBook extends Book{
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title,author);
        this.fileSize = fileSize;
    }

    @Override
    public void read(){
        System.out.println("전자책을 읽습니다.");
    }

    public void displayFileSize(){
        System.out.println("fileSize = " + fileSize);
    }

}

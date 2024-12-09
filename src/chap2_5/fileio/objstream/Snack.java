package chap2_5.fileio.objstream;

import java.io.Serializable;
import java.util.Objects;

//Snack이 스트림을 통과할 수 있도록 직렬화 가능함을 명시
public class Snack implements Serializable {

    public enum Taste {
        GOOD, BAD
    }

    private String snackName;
    private int year;
    private int price;
    private Taste taste;

    public Snack() {
    }

    public Snack(String snackName, int year, int price, Taste taste){
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }
}

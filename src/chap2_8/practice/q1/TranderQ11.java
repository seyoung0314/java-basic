package chap2_8.practice.q1;

import java.util.Objects;

public class TranderQ11 {
    private String trader;
    private int year;
    private int value;

    public TranderQ11() {
    }

    public TranderQ11(String trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TranderQ11 that = (TranderQ11) o;
        return year == that.year && value == that.value && Objects.equals(trader, that.trader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader, year, value);
    }

    @Override
    public String
    toString() {
        return
                "trader='" + trader + '\'' +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}

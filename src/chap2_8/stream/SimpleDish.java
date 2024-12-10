package chap2_8.stream;

import java.util.Objects;

// 맵핑을 위한 클래스
public class SimpleDish {
    private String dishName; // 요리이름
    private int calories;

    public SimpleDish() {
    }

    public SimpleDish(String dishName, int calories) {
        this.dishName = dishName;
        this.calories = calories;
    }

    public SimpleDish(Dish dish){
        this.dishName = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return calories == that.calories && Objects.equals(dishName, that.dishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName, calories);
    }

    @Override
    public String toString() {
        return "SImpleDish{" +
                "dishName='" + dishName + '\'' +
                ", calories=" + calories +
                '}';
    }
}

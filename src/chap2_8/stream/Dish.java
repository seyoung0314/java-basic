package chap2_8.stream;

import java.util.Objects;

public class Dish {
    private String name; // 요리이름
    private boolean vegetarian; // 채식 여부
    private int calories;
    private DishType type;

    public Dish() {
    }

    public Dish(String name, boolean vegeterian, int calories, DishType type) {
        this.name = name;
        this.vegetarian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return vegetarian == dish.vegetarian && calories == dish.calories && Objects.equals(name, dish.name) && type == dish.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vegetarian, calories, type);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}

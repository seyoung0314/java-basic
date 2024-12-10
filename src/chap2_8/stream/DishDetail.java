package chap2_8.stream;

import java.util.Objects;

public class DishDetail {
    private String name;
    private String type;

    public DishDetail() {
    }

    public DishDetail(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public DishDetail(Dish dish){
        this.name = dish.getName();
        this.type = dish.getType().getTypeName();
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DishDetail that = (DishDetail) o;
        return Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

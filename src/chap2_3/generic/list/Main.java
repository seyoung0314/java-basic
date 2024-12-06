package chap2_3.generic.list;

public class Main {
    public static void main(String[] args) {
        GenericList<String> foods = new GenericList<>();
        foods.push("붕어빵");
        foods.push("붕어빵");
        foods.push("붕어빵");
        foods.pop();
        System.out.println("foods = " + foods);

        GenericList<Integer> nembers = new GenericList<>(10,20,30);
        nembers.push(39);
        nembers.push(88);
        nembers.push(13);
        nembers.pop();
        System.out.println("nembers = " + nembers);

        GenericList<Frog> frogList = new GenericList<>();
        frogList.push(new Frog("케로로","12","초록"));
        frogList.push(new Frog("타마마","10","남색"));
        System.out.println("frogList = " + frogList);

    }
}

class Frog {
    String name;
    String height;
    String color;

    public Frog(String name, String height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
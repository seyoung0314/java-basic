package chap2_7.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple<T> {

    //사과의 색상만 추출
    public static List<Color> mappingApplesByColor(List<Apple> basket) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : basket) {
            colorList.add(apple.getColor());
        }
        return colorList;
    }

    public static <X,Y> List<Y> mappedApples(List<X> list, AppleFunction<X,Y> option) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
            mappedList.add(option.apply(x));
        }
        return mappedList;
    }
}

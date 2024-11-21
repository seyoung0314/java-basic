package chap1_2.array;

public class ArraySearch {
    public static void main(String[] args) {

        //배열의 인덱스 탐색과 요소의 유무확인
        String[] foods = {"햄버거", "딸기", "치킨", "붕어빵"};

        String target = "딸기";

        //선형 탐색 : 순차 탐색 - 배열을 0번부터 순차적으로 체크
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        boolean isPresent = index != -1;

        System.out.println(index);
        System.out.println(isPresent);
        System.out.println("target = " + target);
    }
}

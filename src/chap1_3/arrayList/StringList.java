package chap1_3.arrayList;

import java.util.Arrays;

/*
    문자열 배열을 관리하는 객체
 */
public class StringList {

    // 속성
    String[] sArr;

    // 생성자
    StringList() {
        sArr = new String[0];
    }

    // 기능
    void modify(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        sArr[index] = newFoodName;
    }

    boolean isOutOfBounds(int index) {
        return index < 0 || index >= sArr.length;
    }


    // foods 배열의 요소를 출력
    void printFoods() {
        System.out.println(Arrays.toString(sArr));
    }

    String[] copy(int capacity) {
        String[] newSizeArray = new String[sArr.length + capacity];

        int loopCount = (capacity >= 0) ? sArr.length : newSizeArray.length;

        System.arraycopy(sArr, 0, newSizeArray, 0, loopCount);
        return newSizeArray;
    }

    // foods배열에 새 음식을 추가하는 함수
    void push(String newItem) {
        // 1. 사이즈가 1개 더 큰 배열을 생성
        // 2. 원본내용을 복사
        String[] temp = copy(1);

        // 3. 배열의 맨 끝에 새 데이터 추가
        temp[temp.length - 1] = newItem;
        // 4. 주소값 이전
        sArr = temp;
    }

    // foods배열에서 target을 찾아 인덱스를 알려주는 함수
    int indexOf(String targetFoodName) {
        for (int i = 0; i < sArr.length; i++) {
            if (targetFoodName.equals(sArr[i])) {
                return i;
            }
        } // end for
        return -1;
    }

    // 배열의 맨 끝 데이터를 제거하는 함수
    String pop() {
        if (sArr.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }

        String deletedFood = sArr[sArr.length - 1];
        sArr = copy(-1);
        return deletedFood;
    }

    boolean include(String targetFood) {
        return indexOf(targetFood) != -1;
    }

    // 음식이름으로 지우는 메서드
    void remove(String targetFood) {
        if (!include(targetFood)) return;

        for (int i = indexOf(targetFood); i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
    }
    // 오버 로딩: 같은 이름으로 함수를 여러 개 만드는 기능
    void remove(int index) {
        if (isOutOfBounds(index)) return;
        String foodName = sArr[index];
        remove(foodName);
    }

    void insert(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);

        for (int i = sArr.length; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newFoodName;
        sArr = temp;
    }
}

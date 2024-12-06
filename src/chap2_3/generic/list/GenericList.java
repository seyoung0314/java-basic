package chap2_3.generic.list;

import chap1_3.arrayList.StringList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

// 제네릭 배열을 관리하는 제네릭 리스트 클래스
//public class GenericList<T> implements Iterable{
public class GenericList<T>{

    // 필드
    private T[] arr;

    // 생성자
    // 제네릭 타입의 배열은 만들지 못해 오브젝트로 만든 후 다운캐스팅해준다.
    public GenericList() {
        arr = (T[]) new Object[0];
    }
    public GenericList(T...initItems){
        arr = initItems;
    }

    // 원본을 복제하는 기능
    public T[] copy(int capacity) {
        T[] newSizeArray = (T[]) new Object[arr.length+capacity];
        int loopCount = (capacity >= 0) ? arr.length : newSizeArray.length;
        for (int i = 0; i < loopCount; i++) {
            newSizeArray[i] = arr[i];
        }
        return newSizeArray;
    }

    public void push(T newItem){
        T[] temp = copy(1);
        temp[temp.length-1] = newItem;
        arr = temp;
    }

    public T pop(){
        if (arr.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }
        T deletedElem = arr[arr.length - 1];
        arr = copy(-1);
        return deletedElem;
    }

    @Override
    public String toString() {
        return "GenericList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T>() {
//            private int currentIndex = 0;
//
//            @Override
//            public boolean hasNext() {
//                return currentIndex < arr.length;
//            }
//
//            @Override
//            public T next() {
//                if (!hasNext()) {
//                    throw new NoSuchElementException();
//                }
//                return arr[currentIndex++];
//            }
//        };
//    }
}

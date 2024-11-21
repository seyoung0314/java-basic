package chap1_2.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"강아지", "고양이", "새"};
//        String[] petsCopy = pets; // 주소값복사

//        String[] petsCopy = new String[pets.length];
//        petsCopy[0] = pets[0];
//        petsCopy[1] = pets[1];
//        petsCopy[2] = pets[2];

//        for (int i = 0; i < petsCopy.length; i++) {
//            petsCopy[i] = pets[i];
//        }

        String[] petsCopy = Arrays.copyOf(pets, pets.length);

        pets[1] = "햄스터";

        System.out.println("원본 : " + Arrays.toString(pets));
        System.out.println("사본 : " + Arrays.toString(petsCopy));

        System.out.println("원본주소 : " + pets);
        System.out.println("사본주소 : " + petsCopy);
    }
}

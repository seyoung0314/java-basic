package chap1_2.function;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String pushString) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = pushString;
        foods = temp;
        temp = null;
    }

    static int indexOf(String targetString) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(targetString)) {
                index = i;
            }
        }
        return index;
    }

    static void pop() {
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
    }

    static void remove(String removeString) {
        int index = indexOf(removeString);
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = foods[i + 1];
        }
        foods = temp;
        temp = null;
    }

    static boolean include(String includeStirng) {
        boolean flag = false;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(includeStirng)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static void insert(int index, String insertString) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = temp.length - 1; i < index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[temp.length - 1] = insertString;
        foods = temp;
        temp = null;
    }

    static void modify(int index,String modifyString){
        foods[index] = modifyString;
    }
    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();
    }
}

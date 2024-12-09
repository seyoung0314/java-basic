package chap2_7.lambda.basic;

import chap1_7.inherit.example.q5.Order;

public class Main {
    public static void orderPet(Pet pet){
        pet.eat();
    }
    public static void main(String[] args) {

        Pet dog = new Pet() {
            @Override
            public void eat() {
                System.out.println("강아지가 밥을 먹어요.");
            }
        };
        orderPet(dog);


    }
}

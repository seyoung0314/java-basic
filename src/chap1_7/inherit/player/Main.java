package chap1_7.inherit.player;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("전사111");
        Mage mage = new Mage("법사222");
        Hunter hunter = new Hunter("냥꾼333");

        warrior.dash();
        warrior.showStatus();
        mage.showStatus();
        hunter.showStatus();


    }
}
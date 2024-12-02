package chap1_7.inherit.player;

public class Mage extends Player{

    int mana;

    public Mage(String nickname) {
        //  super() : 부모의 생성자 호출
        super(nickname);   // *player
        this.mana = 60;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 마나 : " + mana);
    }

    public void fireBall(){

    }
}

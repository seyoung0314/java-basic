package chap1_7.inherit.player;

public class Hunter extends Player{

    int concentrate;

    public Hunter(String nickname) {
        //  super() : 부모의 생성자 호출
        super(nickname);
        this.concentrate = 60;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 집중력 : " + concentrate);
    }

    public void summonBeast(){

    }
}

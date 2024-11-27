package chap1_5.player;

public class Player {
    String nickName;
    int level;
    int hp;

    Player(String nickName){
        // this는 오직 필드에만 붙일 수 있음
        this.nickName = nickName;
        level = 1;
        hp = 50;
    }


    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    // 공격 기능
    // 파라미터에 this는 자동으로 들어가있음
    void attack(Player targetPlayer){
//        System.out.println("targetPlayer = " + targetPlayer);
//        System.out.println("this = " + this);
        // 상대방의 체력이 10감소
        // 내 체력 5감소
        targetPlayer.hp -= 10;
        this.hp -=5;

        System.out.printf("%s님이 %s님을 공격했습니다.\n",
                this.nickName,targetPlayer.nickName);
        System.out.println("나의 현재체력: "+this.hp);
        System.out.println("상대의 현재체력: "+targetPlayer.hp);
    }
}

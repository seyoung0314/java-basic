package chap1_7.inherit.player;


public class Mage extends Player {

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

    public void fireBall(Player target) {
        if (target == this) {
            System.out.println();
            System.out.println("자신은 공격할 수 없습니다.");
            return;
        }
        System.out.printf("\n%s님이 %s님에게 파이어볼을 씁니다.\n", this.nickname, target.nickname);
        // 상대방의 체력을 19~34사이로 피해를 입힘
        int damage = (int) (Math.random() * 16) + 19;
        System.out.printf("\n%d의 피해를 입었습니다.\n", damage);
        // 상대방 체력 차감
        target.hp = target.hp - damage;
        System.out.printf("\n%s 님 남은 체력 : %d\n", target.nickname, target.hp);
    }


    // 광역공격 (자신은 제외)
    public void thunderbolt(Player... targets) {

        System.out.printf("\n%s님이 썬더볼트을 씁니다.\n", this.nickname);
        for (Player p : targets) {
            if (p != this) {
                // 상대방의 체력을 10~15사이로 피해를 입힘
                int damage = (int) (Math.random() * 6) + 10;
                System.out.printf("\n%s님은 %d의 피해를 입었습니다.\n", p.nickname, damage);
                // 상대방 체력 차감
                p.hp = p.hp - damage;
                System.out.printf("\n%s 님 남은 체력 : %d\n", p.nickname, p.hp);
            }
        }
    }
}

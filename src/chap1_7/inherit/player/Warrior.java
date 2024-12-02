package chap1_7.inherit.player;

public class Warrior extends Player {

    // 직업별 개별 필드
    int rage;

    public Warrior(String nickname) {

        // 상속에서는 자식 객체를 생성하게 되면
        // 부모의 객체도 함께 만들어야함
        // 자바는 자동으로 상속 메모리 구조를 구현하기 위해
        // 자식 생성자의 맨 첫줄에 super()를 삽입하여 부모를 강제호출한다.
        // (부모의 생성자를 반드시 호출해줘야한다는 뜻)

        //  super() : 부모의 기본 생성자 호출
        super(nickname);   // 기본 생성자가 없으면 다른 생성자 호출
        this.rage = 100;
    }




    // 오버라이딩 : 부모가 물려준 메서드가 자식에게 적합하지 않아 자식이 고쳐쓰는 행위
    // 룰 : 부모가 물려준 모양은 유지해야 함(리턴타입,이름,파라미터)

    @Override // 안전하게 오버라이딩할 수 있게 룰을 체크해줌
    public void showStatus(){
        super.showStatus();
        System.out.println("# 분노 : " + rage);
    }

    // 전사 스킬 ( 개별 기능 )
    public void dash(){

    }
}

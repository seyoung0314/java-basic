package chap1_10.abs;

// 추상클래스 : 상속 하위 클래스의 타입 일치를 위한 껍데기
// 인스턴스 객체생성이 안됨
public abstract class Pet {

    private String name;

    // 추상 메서드 : 오버라이딩을 위한 시그니처만 적어두는 메서드
    // 상속받은 클래스가 명시적으로 구현하지 않으면 에러남
    // 추상 메서드는 추상클래스 내에서만 만들 수 있음
    public abstract void eat();

    public abstract void sleep();
}

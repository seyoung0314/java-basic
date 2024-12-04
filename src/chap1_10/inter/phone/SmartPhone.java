package chap1_10.inter.phone;


// 일반 메서드 생성 불가
// 필드값을 가질 수 없음 (상수는 가능)
public interface SmartPhone {

    int A = 10;

    // 카메라기능
    public void camere();

    // 충전기능
    public void charge();

    // 인터넷기능
    public void internet();

}

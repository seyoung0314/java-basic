package chap1_6;

public class MyCar {

    private String mode; // 변속 모드 : D R P N

    // 변속 모드를 검증하고 세팅해주는 메서드 : setter
    public void setMode(String inputMode){
        switch (inputMode){
            case "D" :
            case "R" :
            case "N" :
            case "P" :
                this.mode = inputMode;
                break;
            default: this.mode = "P";
        }
    }

    // 필드값을 가져오는 메서드 : getter
    public String getMode() {
        return mode;
    }

    // 기능
    // 엔진오일 분사
    private void injectOil(){
        System.out.println("엔진오일 분사");
    }
    // 실린더가 움직이는 기능
    private void moveCylinder(){
        System.out.println("실린더 동작");
    }
    // 시동거는 기능
    private void powerOn(){
        System.out.println("시동");
    }
    // 시동버튼 누르기
    public void pressStartBtn(){
        System.out.println("시동 버튼");
        injectOil();
        moveCylinder();
        powerOn();
    }
}

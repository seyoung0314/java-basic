package chap1_6.practice.park;

import java.time.LocalDateTime;
import java.util.Date;

public class ParkEntry {
    public String visitorName;
    private String entryTime;
    private String exitTime;

    private ParkEntry(String visitorName, String entryTime, String exitTime) {
        this.visitorName = visitorName;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public ParkEntry(String visitorName) {
        this.visitorName = visitorName;
        this.entryTime = this.nowTime();
        this.exitTime = "";
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    // 메서드

    private String nowTime(){
        // Date 객체는 구식이라 요즘엔 LocalDate 나 Calendar 사용함
        // LocalDate - YYYY-MM-DD 형식으로 반환
        // LocalDateTime - YYYY-MM-DD T HH:MM:SS.SSSSSSSS형식
        LocalDateTime time = LocalDateTime.now();

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        String now = String.format("%s %02d:%02d:%02d",
                time.toLocalDate().toString(),hour,minute,second);
        System.out.println(now);

        return now;
    }

    public  void visitorRecord(String inputName){
        String now = nowTime();
        System.out.printf("\n안녕하세요! %s님!\n",inputName);
        System.out.printf("\n%s에 방문하셨습니다!",now);
        ParkVisitors.addVisitor(inputName);
    }
    public void displayVisitor(){

    }

}

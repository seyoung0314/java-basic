package chap2_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        // 자바 8이전
        Date date = new Date();
        System.out.println("date = " + date);
        
        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        
        // 특정 날짜정보 생성
        LocalDate futureDate = LocalDate.of(2025, 3, 25);
        System.out.println("futureDate = " + futureDate);

        // 날짜 연산
        LocalDateTime localDateTime = now.plusDays(67);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime1 = now.plusYears(1).plusMonths(3).plusDays(20);
        System.out.println("localDateTime1 = " + localDateTime1);

        int month = now.getMonthValue();
        System.out.println("month = " + month);
        
        // 날짜 포맷 변경
        DateTimeFormatter pattern 
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");

        String format = now.format(pattern);
        System.out.println("format = " + format);
        
        // 사이연도 구하기
        LocalDate birthDay = LocalDate.of(1994, 3, 14);
        Period period = Period.between(birthDay, nowDate);
        int years = period.getYears();
        System.out.println("years = " + years);

        // 사이날짜 구하기
        long between = ChronoUnit.DAYS.between(birthDay, nowDate);
        System.out.println("between = " + between);
    }
}

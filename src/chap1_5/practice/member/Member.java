package chap1_5.practice.member;

import java.time.LocalDateTime;
import java.util.UUID;

import static chap1_5.practice.member.Gender.*;

public class Member {
    // 회원정보: 이메일, 비밀번호, 이름, 회원식별번호, 성별, 나이
    String email;
    String password;
    String memberName;
    String id;
    // !! 열거형
    Gender gender = MALE;
    int age;
    LocalDateTime registerDate;

    // 생성자 : 객체가 처음 생성될 때 값을 세팅

    public Member(String email, String password, String memberName, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.id = UUID.randomUUID().toString(); // 랜덤상수
        this.gender = gender;
        this.age = age;
        this.registerDate = LocalDateTime.now();
    }

    // 한 명의 회원정보를 출력하는 메서드
    void inform(){
        System.out.printf("# %s | %s | %s | %d세\n"
                        ,email,memberName,gender,age);
    }
    // 한 명의 회원 정보를 상세하게 출력하는 메서드
    void detailInfo() {
        System.out.printf("========= [%s]님 정보 조회 ========\n", this.memberName);
        System.out.println("# 회원번호: " + this.id);
        System.out.println("# 이메일: " + this.email);
        System.out.println("# 비밀번호: " + this.password);
        System.out.println("# 성별: " + (this.gender == MALE ? "남성" : "여성"));
        System.out.println("# 나이: " + this.age + "세");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }
}

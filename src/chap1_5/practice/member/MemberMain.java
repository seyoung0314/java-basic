package chap1_5.practice.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        // 멤버 저장소 객체 생성
        MemberRepository mr = new MemberRepository();

        // 회원 데이터 추가
        mr.addMembers(new Member("ddd@gmail.com","4444","삐삐",Gender.FEMALE,24));

        Scanner sc = new Scanner(System.in);
        String inputEmail = sc.nextLine();

        // 이메일 중복 검사
        boolean flag = mr.isDuplicateEmail(inputEmail);
        System.out.println("flag = " + flag);
        System.out.println("================================");

        String inputPassword = sc.nextLine();
        String inputName = sc.nextLine();

        // 전체 회원 데이터 조회
        Member[] members = mr.getMembers();
        for(Member m : members){
            if (m.memberName.equals( "눈사람")) {
                m.inform();
//                System.out.println(m);
            }
//            System.out.println("m.memberName = " + m.memberName);
            System.out.println(m);
        }


    }
}

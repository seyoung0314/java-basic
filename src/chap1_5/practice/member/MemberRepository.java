package chap1_5.practice.member;

import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.Scanner;

public class MemberRepository {
    Member[] memberList;
    Member[] stashMember = new Member[]{};
    Scanner sc = new Scanner(System.in);

    MemberRepository() {
        this.memberList = new Member[]{
                new Member("aaa@gmail.com", "pass111", "눈사람", Gender.FEMALE, 20),
                new Member("bbb@gmail.com", "pass222", "루피", Gender.FEMALE, 30),
                new Member("ccc@gmail.com", "pass333", "키보드", Gender.MALE, 10)
        };

    }

    // 모든 회원정보를 가져오는 메서드
    Member[] getMembers() {
        return this.memberList;
    }


    //회원목록에 새로운 회원을 추가하는 메서드
    void addMembers(Member newMember) {
        //push
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;
    }

    /**
     * 비밀번호 일치 확인 메서드
     *
     * @param targetEmail
     * @return - boolean
     */
    boolean isPasswordValid(String targetEmail, String inputPassword,String option) {
        Member targetMember;
        if(option.equals("recover")){
            targetMember = findMemberByEmail(targetEmail,"recover");
        }else{
            targetMember =  findMemberByEmail(targetEmail,"none");
        }
        if (targetMember.password.equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }

    int searchIndex(String targetEmail) {
        int index = -1;
        Member[] members = this.getMembers();
        for (int i = 0; i < members.length; i++) {
            if (targetEmail.equals(members[i].email)) {
                index = i;
                return index;
            }
        }
        return index;
    }

    /**
     * 회원정보 삭제
     */
    void deleteMember(String targetEmail) {
        Member[] temp = new Member[memberList.length - 1];
        int targetIndex = this.searchIndex(targetEmail);

        for (int i = targetIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        stashAddMember(memberList[memberList.length - 1]);
        memberList = temp;
        temp = null;
    }

    void stashAddMember(Member newMember) {
        //push
        Member[] temp = new Member[stashMember.length + 1];
        for (int i = 0; i < stashMember.length; i++) {
            temp[i] = stashMember[i];
        }
        temp[temp.length - 1] = newMember;
        stashMember = temp;
    }


    // 데이터 복구
    void recoverDeletedMember(String targetEmail) {
        for (Member m : stashMember) {
            if (targetEmail.equals(m.email)) {
                addMembers(m);
            }
        }
    }

    /**
     * 이메일 중복 여부를 확인하는 메서드
     *
     * @param targetEmail - 이메일 검사 대상 문자열
     * @return - 이메일이 중복이면 true, 중복이 아니면 false
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 해당 이메일 객체를 리턴하는 메서드
     *
     * @param targetEmail - 탐색 대상의 이메일
     * @return - 이메일이 일치하는 회원을, 없다면 null 반환
     */
    Member findMemberByEmail(String targetEmail, String option) {
        Member[] members;
        if (option.equals("recover")) {
            members = stashMember;
        } else {
            members = memberList;
        }
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return m;
            }
        }
        return null;
    }


    // 입력을 쉽게 처리해주는 메서드
    String prompt(String message) {
        System.out.printf("%s ", message);
        return sc.nextLine();
    }
}

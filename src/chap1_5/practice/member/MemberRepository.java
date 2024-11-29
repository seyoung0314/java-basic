package chap1_5.practice.member;

import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.Scanner;

public class MemberRepository {

    Member[] memberList;    // 가입된 회원배열
    Member[] stashMember = new Member[]{};  // 삭제된 회원 백업 배열

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


    /**
     * 회원목록에 새로운 회원을 추가하는 메서드
     *
     * @param newMember - 새로운 회원 정보
     */
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
     * @param targetEmail - 일치하는지 확인 할 대상 이메일
     * @param inputPassword - 사용자가 입력한 비밀번호
     * @param option - "recover" : 복구메뉴 옵션
     * @return - 비밀번호가 일치하면 true
     */
    boolean isPasswordValid(String targetEmail, String inputPassword, String option) {
        Member targetMember;
        if (option.equals("recover")) {
            targetMember = findMemberByEmail(targetEmail, "recover");
        } else {
            targetMember = findMemberByEmail(targetEmail, "none");
        }
        if (targetMember.password.equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 회원 배열에서 특정회원의 배열 인덱스를 찾는 메서드
     *
     * @param targetEmail - 찾을 회원의 이메일
     * @return - 배열의 위치 index
     */
    int searchIndex(String targetEmail) {
        Member[] members = this.getMembers();
        for (int i = 0; i < members.length; i++) {
            if (targetEmail.equals(members[i].email)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 회원 삭제 메서드
     *
     * @param targetEmail - 삭제 할 대상 이메일
     */
    void deleteMember(String targetEmail) {
        Member[] temp = new Member[memberList.length - 1];
        int targetIndex = this.searchIndex(targetEmail);

        // 삭제된 회원정보를 백업
        stashAddMember(memberList[targetIndex]);

        for (int i = targetIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
        temp = null;
    }

    /**
     * 삭제된 회원정보 백업 메서드
     *
     * @param newMember - 삭제된 회원의 정보
     */
    void stashAddMember(Member newMember) {
        //push
        Member[] temp = new Member[stashMember.length + 1];
        for (int i = 0; i < stashMember.length; i++) {
            temp[i] = stashMember[i];
        }
        temp[temp.length - 1] = newMember;
        stashMember = temp;
    }


    /**
     * 회원정보 복구 메서드
     *
     * @param targetEmail - 복구 대상 회원의 이메일
     */
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
     * 비밀번호 변경 메서드
     *
     * @param targetEmail - 이메일 변경 대상 문자열
     * @param newPassword - 변경 할 비밀번호
     */
    void updatedPassword(String targetEmail, String newPassword) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                m.password = newPassword;
            }
        }
    }

    /**
     * 해당 이메일 객체를 리턴하는 메서드
     *
     * @param targetEmail - 탐색 대상의 이메일
     * @param option      - "recover" 옵션 일 시 삭제된 회원 리스트로 조회
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

    int size() {
        return memberList.length;
    }

    // 입력을 쉽게 처리해주는 메서드
    String prompt(String message) {
        System.out.printf("%s ", message);
        return sc.nextLine();
    }
}


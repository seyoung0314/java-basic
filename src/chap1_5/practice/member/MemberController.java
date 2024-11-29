package chap1_5.practice.member;

import chap1_2.Switch;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.Scanner;

public class MemberController {

    // 필드 - 의존성 필드 ( 객체가 일을 하기 위해 다른 객체에 의존(협력))
    Scanner sc;
    MemberRepository mr;
    Member[] members;

    MemberController() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    //프로그램 초기화면 출력
    void mainView() {
        int size = mr.size();
        System.out.printf("\n##### 회원관리 시스템 (현재 회원 수 : %d명) #####\n", size);
        System.out.println("* 1. 회원정보 등록하기");
        System.out.println("* 2. 전체 회원 조회");
        System.out.println("* 3. 개별 회원 조회");
        System.out.println("* 4. 회원정보 수정하기");
        System.out.println("* 5. 회원정보 삭제하기");
        System.out.println("* 6. 회원정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("===================================");
    }

    //프로그램을 실행하는 메서드
    void Start() {
        while (true) {
            this.mainView();
            int size = mr.size();
            String menuNum = prompt(">> ");
            switch (menuNum) {
                case "1":
                    sighUp();
                    break;
                case "2":
                    showALlMembers();
                    System.out.println("전체 회원 조회 시작");
                    break;
                case "3":
                    showDetails();
                    break;
                case "4":
                    modifyMember();
                    break;
                case "5":
                    if (size == 0) {
                        System.out.println("# 현재 삭제 가능한 회원이 없습니다.");
                    } else {
                        deleteMember();
                    }
                    break;
                case "6":
                    recoverMember();
                    break;
                case "7":
                    System.out.println("종료");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }

    }

    // 6번 회원정보 복구하기
    void recoverMember() {
        while (true) {
            String email = prompt("# 복구 대상의 이메일 : ");
            Member foundEmail = mr.findMemberByEmail(email, "recover");
            if (foundEmail != null) {
                while (true) {
                    String password = prompt("비밀번호 : ");
                    if (mr.isPasswordValid(email, password, "recover")) {
                        mr.recoverDeletedMember(email);
                        System.out.printf("\n%s 님 정보 복구되었습니다.\n", email);
                        break;
                    } else {
                        System.out.println("# 비밀번호가 일치하지 않습니다.");
                    }
                }
                break;
            } else {
                System.out.println("# 존재하지 않는 이메일입니다.");
            }
        }
    }

    // 5번 회원 삭제
    void deleteMember() {
        while (true) {
            String email = prompt("# 삭제 대상의 이메일 : ");
            Member foundEmail = mr.findMemberByEmail(email, "none");

            if (foundEmail != null) {
                while (true) {
                    String password = prompt("# 현재 비밀번호 : ");

                    // 사용자 삭제 검증
                    if (mr.isPasswordValid(email, password, "none")) {
                        System.out.println("# 정말로 삭제하시겠습니까?");
                        String dangerMessage = prompt("# 이메일을 다시 한번 입력하세요. : ");

                        // 이메일 재입력 받아서 삭제하도록
                        if (dangerMessage.equals(email)) {
                            mr.deleteMember(email);
                            System.out.println("# 회원탈퇴가 처리되었습니다.");
                            System.out.println("# 복구하시려면 복구메뉴를 사용해주세요.");

                        } else {
                            System.out.println("# 다시 확인해주세요.");
                        }
                        break;
                    } else {
                        System.out.println("# 비밀번호가 일치하지 않습니다.");
                    }
                }
                break;
            } else {
                System.out.println("# 존재하지 않는 이메일입니다.");
            }
        }
    }

    // 4번 비밀번호 수정
    void modifyMember() {
        while (true) {
            String email = prompt("# 수정 대상의 이메일 : ");
            Member foundEmail = mr.findMemberByEmail(email, "none");

            if (foundEmail != null) {
                while (true) {
                    String password = prompt("# 비밀번호 : ");
                    if (foundEmail.email.equals(password)) {
                        System.out.println("# 이전 비밀번호와 같습니다.");
                    } else {
                        break;
                    }
                }
                System.out.printf("# %s님의 비밀번호를 변경합니다.\n", foundEmail.memberName);

                // 자바의 객체지향적 구조처리에는 맞지않음
//                foundEmail.password = prompt("# 새로운 비밀번호 : ");
                String newPassword = prompt("# 새로운 비밀번호 : ");
                mr.updatedPassword(foundEmail.email, newPassword);
                System.out.println("# 비밀번호 변경이 완료되었습니다.");
                break;
            } else {
                System.out.println("존재하지 않는 이메일입니다.");
            }
        }
    }

    // 3번 : 개별 조회 입출력
    void showDetails() {
        while (true) {
            String email = prompt("#조회 대상의 이메일");

            // 조회 대상 탐색 -> 성공 시 해당 객체를 받아옴
            Member foundMember = mr.findMemberByEmail(email, "none");

            if (foundMember != null) {
//                foundMember.inform();
                foundMember.detailInfo();
//                System.out.println(foundMember.toString());
                break;
            } else {
                System.out.println("\n 조회 결과가 없습니다.");
            }
        }
    }

    // 이메일을 중복이 안될 때까지 입력받고 중복이 안된 이메일을 리턴
    String checkDuplicateEmailInput() {
        while (true) {
            String email = prompt("# 이메일 :");
            // 이메일 중복 검사
            if (mr.isDuplicateEmail(email)) {
                System.out.println("# 중복된 이메일입니다.");
            } else {
                return email;
            }
        }
    }

    // 성별 입력값 검사 메서드
    Gender checkDuplicateGenderInput() {
        while (true) {
            String inputGender = prompt("# 성별(M/F) :");
            Gender gender;
            if (inputGender.equals("M") || inputGender.equals("m")) {
                inputGender = inputGender.toUpperCase();
                return Gender.MALE;
            } else if (inputGender.equals("F") || inputGender.equals("f")) {
                return Gender.FEMALE;
            } else {
                System.out.println("# M/F 형태로 입력해주세요.");
            }
        }
    }

    // 나이 입력값 검사 메서드
    String checkDuplicateAgeInput() {
        while (true) {
            String age = prompt("# 나이 :");
            if (age.matches("-?\\d+(\\.\\d+)?")) {
                return age;
            } else {
                System.out.println("# 숫자로 입력해주세요.");
            }
        }
    }


    // 회원가입을 입출력 처리하는 메서드
    void sighUp() {
        System.out.println("\n ===== 회원가입 시작 =====");
        String email = checkDuplicateEmailInput();
        String password = prompt("# 비밀번호 :");
        String name = prompt("# 이름 :");
        Gender gender = checkDuplicateGenderInput();
        String age = checkDuplicateAgeInput();

        // 회원 목록에 추가
        mr.addMembers(new Member(email, password, name, gender, Integer.parseInt(age)));

        System.out.println("# 회원가입이 완료되었습니다.");

    }

    // 전체 회원 정보를 화면에 출력하는 메서드
    void showALlMembers() {
        Member[] members = mr.getMembers();
        int count = 0;
        for (Member m : members) {
            count++;
        }
        System.out.printf("\n ===== 전체 회원 정보 (%d명) =====\n", count);
        for (Member m : members) {
            m.inform();
        }
        System.out.println("\n ===== 엔터를 눌러서 계속 =====");
        // 입력커서를 생성해서 코드를 잠시 멈춤
        sc.nextLine();
    }

    // 입력을 쉽게 처리해주는 메서드
    String prompt(String message) {
        System.out.printf("%s ", message);
        return sc.nextLine();
    }
}

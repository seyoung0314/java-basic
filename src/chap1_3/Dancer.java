package chap1_3;

import java.util.Arrays;

// class : 객체를 만들기 위한 설계도
public class Dancer {
    // 객체는 속성과 기능

    // 속성 :  객체를 명사적으로 표현
    //필드
    // public은 같은 패키지(쉽게말해서 폴더)안에선 선언안해도되고
    // 같은 상위폴더를 가지고 있다면 public 선언해줘야함
    // 보안, 캡슐화 측면에서 적절하게 사용해야함
    String dancerName;  //댄서명
    String crewName;    //크루명
    String[] genres;    //장르목록
    int dancelevel; //0:초보, 1:아마추어, 2:프로

    //method
    //함수는 static을 붙이지 않음

    //춤추는 기능
    void dance() {
        System.out.println(dancerName + "가 춤을 춥니다.");
    }

    //자기소개 기능
    void introduce() {
        System.out.println("이름 : " + dancerName);
        System.out.println("크루 : " + crewName);
        System.out.println("장르 : " + Arrays.toString(genres));
        System.out.println("레벨 : " + dancelevel);
    }

    // 생성자 : 객체가 생성될 때 호출되는 특별한 함수
    //-규칙
    //1. 생성자의 이름은 반드시 클래스명과 같아야함
    //2. 생성자는 무조건 void 리턴
    Dancer() {
        dancerName = "이름";
        crewName = "크루명";
        genres = new String[]{"장르1"};
        dancelevel = 0;
    }

    //오버로딩 : 메서드를 같은 이름으로 여러 개 생성
    // 규칙 : 이름은 같지만 파라미터의 타입이나 갯수가 달라야 함.
    Dancer(String dName){
        dancerName = dName;
        crewName = "크루명22";
        genres = new String[]{"장르22"};
        dancelevel = 0;
    }
    Dancer(String dName, String cName){
        dancerName = dName;
        crewName = cName;
        genres = new String[]{"장르22"};
        dancelevel = 0;
    }
    Dancer(String dName, String cName,String ... genresList){
        dancerName = dName;
        crewName = cName;
        genres = genresList;
        dancelevel = 0;
    }
    // java는 소멸자 개념이 없고 자동으로 처리됨 (메모리관리가 힘들어 게임같은건 만들기 애매)
}


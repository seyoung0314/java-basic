package chap2_4.song_ex;


import java.util.Map;
import java.util.Set;

import static chap1_9.util.InputUtil.*;

// 프로그램의 입출력 처리
public class ArtistController {

    private ArtistRepository repository;

    public ArtistController() {
        this.repository = new ArtistRepository();
    }

    public void start() {

        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", repository.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 등록된 가수 전체조회");
            System.out.println("# 4. 프로그램 종료");
            System.out.println("==================================");

            String menuNum = inputStr(">> ");

            switch (menuNum) {
                case "1":
                    addArtistProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    // 전체 등록되어있는 가수들의 이름과 노래의 개수를 출력
                    // ex) 동방신기 - 총 4곡
                    //     르세라핌 - 총 2곡
                    showAllArtist();
                    break;
                case "4":
                    System.out.println("# 프로그램을 종료합니까? [y/n]");
                    String exit = inputStr(">> ");
                    if (exit.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        System.out.println("# 종료를 취소합니다.");
                    }
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }// end switch

            System.out.println("==== 계속하시려면 Enter... ====");
            inputStr("");
        }

    } // end start()

    // 3번메뉴 전체 가수조회 - 가수명과 총노래개수
    private void showAllArtist() {
        // 가수명이랑 노래개수 내놔
        Map<String, Integer> artistData =
                repository.getArtistNameAndSongCount();

        System.out.println("===== 전체 가수 정보 =====");
        for (String name : artistData.keySet()) {
            System.out.printf("# %s - 총 %d곡\n", name, artistData.get(name));
        }
    }

    // 2번메뉴 특정 가수의 노래리스트 출력
    private void searchProcess() {

        String name = inputStr("\n# 검색할 가수명을 입력하세요: ");

        if (repository.isRegistered(name)) {
            // 노래목록 내놔
            Set<String> trackList = repository.getTrackList(name);

            System.out.printf("\n# %s님의 노래목록\n", name);
            System.out.println("======================");
            for (String song : trackList) {
                System.out.printf("# %s\n", song);
            }

        } else {
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }
    }

    // 1번메뉴 : 가수 추가 입출력 처리
    private void addArtistProcess() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        String name = inputStr("- 가수명: ");
        String song = inputStr("- 노래명: ");

        // 1. 지금 등록하는 가수가 신규등록인지 기존 가수인지


        // 2. 신규가수인지를 확인해보려면 Repository에 물어봐야 함
        boolean registered = repository.isRegistered(name);

        if (registered) {
            // 기존 가수
            //   1-b. 기존가수라면??
            //     - Map에서 가수정보를 가져온다.
            //     - 그 가수정보의 노래리스트에 노래만 추가한다
            boolean flag = repository.addNewSong(name, song);
            if (!flag) {
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", song);
            } else {
                System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", name, song);
            }
        } else {
            // 신규 가수
            //   1-a. 신규가수라면 뭘??
            //     - Artist객체를 생성
            //     - 이걸 Map에 저장
            repository.addNewArtist(name, song);
            System.out.printf("\n# %s님이 신규등록되었습니다.\n", name);
        }
    }

} // end class

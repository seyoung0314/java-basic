package chap2_4.song;

import chap1_9.util.InputUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtistController {
    private ArtistRepository repository;

    public ArtistController() {
        this.repository = new ArtistRepository(new HashMap<>());
    }

    //프로그램 초기화면 출력
    void mainView() {
        int size = repository.count();
        System.out.printf("\n##### 음악 관리 프로그램 (현재 등록 가수 : %d명) #####\n", size);
        System.out.println("* 1. 노래 등록하기");
        System.out.println("* 2. 가수 검색");
        System.out.println("* 3. 등록된 가수 전체 조회");
        System.out.println("* 4. 노래 찾기");
        System.out.println("* 5. 프로그램 종료");
        System.out.println("===================================");
    }

    void subView() {
        while (true) {
            System.out.println("1. 세부 곡 정보 확인");
            System.out.println("2. 메인 메뉴로 돌아가기");
            int inputInt = InputUtil.inputInt(">> ");
            switch (inputInt) {
                case 1: allPrintInfo("sub");
                    break;
                case 2:
                    return;
            }
        }
    }

    public void start() {
        while (true) {
            this.mainView();
            int inputNum = InputUtil.inputInt(">>");
            switch (inputNum) {
                case 1:
                    this.addSong();
                    break;
                case 2:
                    this.printInfo();
                    break;
                case 3:
                    this.allPrintInfo("main");
                    break;
                case 4:
                    this.searchSong();
                    break;
                case 5:
                    return;
            }
        }
    }

    private void searchSong() {
        Set<String> nameSet = new HashSet<>();
        System.out.println("#검색할 노래 제목을 입력하세요.");
        String inputSongName = InputUtil.inputStr("- 노래 제목 : ");
        if (repository.count() == 0) {
            System.out.println("등록된 노래가 없습니다.");
        }else{
            Map<String, Artist> artistMap = repository.getArtistMap();
            for (Map.Entry<String,Artist> entry : artistMap.entrySet()){
                if(entry.getValue().hasSong(inputSongName)){
                    nameSet.add(entry.getKey());
                }
            }
//            Set<String> keys = artistMap.keySet();
//            for (String key : keys) {
//                Artist artist = artistMap.get(key);
//                if(artist.hasSong(inputSongName)){
//                    nameSet.add(key);
//                }
//            }
            if(nameSet.isEmpty()){
                System.out.println("찾으시는 노래는 정보가 없습니다.");
            }else{
                for (String name : nameSet) {
                    System.out.println("# " + name);
                }
            }
        }
    }

    private void detailAllPrintInfo(String key) {
        Set<String> trackList = repository.getTrackList(key);
            System.out.printf("#%s의 노래 목록\n",key);
        for (String s : trackList) {
            System.out.println("# " + s);
        }
    }

    private void allPrintInfo(String option) {

        if (repository.count() == 0) {
            System.out.println("#등록된 가수가 없습니다.");
        } else {
            Map<String, Artist> artistMap = repository.getArtistMap();
            Set<String> keys = artistMap.keySet();
            for (String key : keys) {
                Artist artist = artistMap.get(key);
                Set<String> songList = artist.getSongList();
                int size = songList.size();
                if (option.equals("sub")) {
                    detailAllPrintInfo(key);
                } else {
                    System.out.println(key + " : " + size + "곡");
                }
            }
        }
        this.subView();
    }

    private void printInfo() {

        System.out.println("#검색할 가수명을 입력하세요.");

        String inputName = InputUtil.inputStr("- 가수명 : ");

        Set<String> trackList = repository.getTrackList(inputName);
        if (repository.isRegistered(inputName)) {
                System.out.println("#노래 목록");
            for (String s : trackList) {
                System.out.println("# " + s);
            }
        } else {
            System.out.println("등록되있는 가수가 아닙니다.");
        }
    }

    private void addSong() {

        System.out.println("#노래 등록을 시작합니다.");
        String inputName = InputUtil.inputStr("- 가수명 : ");
        String inputSongName = InputUtil.inputStr("- 노래명 : ");

        if (repository.isRegistered(inputName)) {
            repository.addNewSong(inputName, inputSongName);
        } else {
            Artist newArtist = new Artist(inputName);
            if (!newArtist.addSong(inputSongName)) {
                System.out.println("#이미 저장된 곡입니다.");
            } else {
                repository.addArtist(inputName, inputSongName);
                System.out.printf("\n# %s님이 신규등록되었습니다.\n", inputName);
            }
        }
    }
}

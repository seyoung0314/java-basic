package chap2_4.song_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수객체를 여러 개 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key: 가수를 찾을 가수명, value: 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    // 현재 저장된 가수의 숫자를 알려주는 메서드
    public int count() {
        return artistMap.size();
    }

    // 현재 주어진 가수명이 map에 있는지 확인하는 기능
    // containsKey() 메서드를 검색해보세요
    public boolean isRegistered(String artistName) {
        return artistMap.containsKey(artistName);
    }

    // 새로운 가수 객체 정보를 map에 저장하는 기능
    public void addNewArtist(String artistName, String songName) {
        // 신규가수를 생성
        Artist newArtist = new Artist(artistName);

        // 노래를 노래리스트에 추가
        newArtist.addSong(songName);

        // 신규가수를 맵에 저장
        artistMap.put(artistName, newArtist);
    }

    // 주어진 가수명으로 가수의 노래트랙리스트를 가져오는 기능
    public Set<String> getTrackList(String artistName) {
        // 맵에서 가수를 꺼냄
        Artist artist = artistMap.get(artistName);
        Set<String> songList = artist.getSongList();
        return songList;
    }

    // 기존 가수에게 노래만 추가하는 기능
    public boolean addNewSong(String name, String song) {
        // 기존 가수를 맵에서 꺼내옴
        Artist artist = artistMap.get(name);

        // 그 가수의 노래리스트에 노래를 추가
        boolean flag = artist.addSong(song);
        return flag;
    }

    /**
     * 모든 가수명과 그 가수의 노래개수를 리턴해야함.
     */
    public Map<String, Integer> getArtistNameAndSongCount() {
        // 목표: 1. 맵에 있는 가수명을 모두 추출
        //       2. 그 가수의 노래목록을 모두 추출 -> 개수를 셈

        /*
            {
                '동방신기': 4,
                '티아라': 6,
                '아이유': 2,
            }
         */
        Map<String, Integer> artistData = new HashMap<>();

        for (String artistName : artistMap.keySet()) {
            // 가수명 추출
            // 노래목록 추출
            Artist artist = artistMap.get(artistName);
            Set<String> songList = artist.getSongList();
            int size = songList.size();

            artistData.put(artistName, size);
        }

        return artistData;
    }
}

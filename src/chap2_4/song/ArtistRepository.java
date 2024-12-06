package chap2_4.song;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 가수객체를 여러 개 관리하는 클래스
public class ArtistRepository {
    //가수들을 담을 자료구조 선언
    // key : 가수명 , value : 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository(Map<String, Artist> artistMap) {
        this.artistMap = new HashMap<>();
    }

    // 현재 저장된 가수의 숫자를 알려주는 메서드
    public int count() {
        return artistMap.size();
    }

    // 현재 주어진 가수명이 map에 존재하는 지 확인해주는 메서드
    // containsKey() 사용
    public boolean isRegistered(String artistName) {
        return this.artistMap.containsKey(artistName);
    }

    // 새로운 가수 객체 정보를 map에 저장하는 기능
    public void addArtist(String artistName, String songName) {

        artistMap.put(artistName, new Artist(artistName));
        addNewSong(artistName,songName);
    }

    // 기존 가수 객체 정보를 map에 저장하는 기능
    public void addNewSong(String artistName, String songName) {
        artistMap.get(artistName).addName(artistName,songName);
    }

    // 주어진 가수명으로 가수의 노래트랙리스트를 가져오는 기능
    public Set<String> getTrackList(String artistName) {
        Set<String> temp = new HashSet<>();
        Set<String> keys = artistMap.keySet();

        for (String key : keys) {
            if(key.equals(artistName)){
                Artist artist = artistMap.get(artistName);
                Set<String> songList = artist.getSongList();
                return songList;
            }
        }
        return null;
    }

    public Map<String, Artist> getArtistMap() {
        return artistMap;
    }
}

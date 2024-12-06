package chap2_4.song;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Artist {

    private String artistName;
    private Set<String> songList;

    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>(); // 비어있는 Set을 생성
    }

    /**
     * 노래 목록에 노래를 추가하는 기능
     *
     * @param songName - 노래목록에 새롭게 추가될 노래 제목
     * @return - 성공적으로 중복없이 추가되면 true
     */
    public boolean addSong(String songName) {

        return this.songList.add(songName);
    }

    public void addName(String inputName, String songName) {
        this.artistName = inputName;
        this.songList.add(songName);
    }

    // 노래목록을 가져오는 기능
    public Set<String> getSongList() {
        return songList;
    }

    // 노래가 존재하는 지 확인하는 메서드
    public boolean hasSong(String songName){
        return this.songList.contains(songName);
    }
}

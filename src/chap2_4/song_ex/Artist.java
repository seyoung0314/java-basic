package chap2_4.song_ex;


import java.util.HashSet;
import java.util.Set;

// 가수
public class Artist {

    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>(); // 비어있는 set을 생성
    }

    /**
     * 노래 목록에 노래를 추가하는 기능
     * @param songName - 노래목록에 새롭게 추가될  노래 제목
     * @return - 성공적으로 중복없이 추가되면 true, 아니면 false
     */
    public boolean addSong(String songName) {
        boolean flag = this.songList.add(songName);
        return flag;
    }

    // 노래목록을 가져오는 기능
    public Set<String> getSongList() {
        return songList;
    }
}


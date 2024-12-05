package chap1_10.practice.mediaplayable;

interface MediaPlayable {
    public void play();     //재생

    public void pause();    //일시 정지

    public void stop();     //정지
}

class AudioPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("오디오가 재생됩니다.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {
    }
}

class VideoPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("비디오가 재생됩니다.");
    }

    @Override
    public void pause() {
    }

    @Override
    public void stop() {
    }
}

class ImageDisplay implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}

// 미디어 플레이어 관리 클래스
class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {

        // 주어진 media를 mediaList배열에 추가
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];

        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[mediaList.length] = media;
        mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }
}

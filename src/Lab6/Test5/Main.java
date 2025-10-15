package Lab6.Test5;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song("Shape of you", "Ed Sheeran");
        Video myVideo = new Video("Inception", 180);

        Playable[] playables = {mySong, myVideo};

        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
        }
    }
}

package Lab6.Test5;

public class Video implements Playable{
    private String title;
    private int duration;

    public  Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    @Override
    public void play() {
        System.out.println("playing video " + this.title + " " + this.duration);
    }
    @Override
    public void pause() {
        System.out.println("pausing video " + this.title);
    }
}

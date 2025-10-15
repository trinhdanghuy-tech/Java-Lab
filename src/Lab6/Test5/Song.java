package Lab6.Test5;

public class Song implements Playable{
    private String tilte;
    public String artist;

    public Song(String tilte, String artist){
        this.tilte = tilte;
        this.artist = artist;
    }
    @Override
    public void play() {
        System.out.println("Playing Song " + this.tilte + " by " + this.artist);
    }

    @Override
    public void pause() {
        System.out.println("pausing song " + this.tilte);
    }
}

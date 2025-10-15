package Lab6.Test5;

public interface Playable {
     void play();
     void pause();

     default  void stop() {
         System.out.println("stop");
     }
}

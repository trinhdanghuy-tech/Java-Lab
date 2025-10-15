package Lab6.Final;

public interface Trainable {
    void attendTrain(String topic);

    default void feedback() {
        System.out.println("Thanks for the training session!");
    }
}

package Lab8.Test2;

public class ThrowAndThrows {

    public void checkScore(int score) {
        if(score < 0 || score > 10){
            throw new IllegalArgumentException("Điểm không hợp lệ phải từ 0 đến 10!");
        }
        else {
            System.out.println("Điểm hợp lệ là :" + score);
        }
    }
}

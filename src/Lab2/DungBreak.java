package Lab2;

public class DungBreak {
    public static void main(String[] args) {
        int i = 9;
        while (i <= 100){
            if (i % 7 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}

package Lab8.Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điểm của bạn: ");
        int score = sc.nextInt();
        try {
            ThrowAndThrows a = new ThrowAndThrows();
            a.checkScore(score);
        }
        catch (IllegalAccessError e) {
            throw e;
        }
        finally {
            System.out.println("Kết thúc chướng trình");
            sc.close();
        }

    }
}

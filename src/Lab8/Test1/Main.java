package Lab8.Test1;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch (Exception e) {
            System.err.println("Khong the chia cho khong");
        }
        finally {
            System.out.println("Luon duoc thuc thi");
        }
    }
}

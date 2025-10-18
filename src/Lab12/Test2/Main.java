package Lab12.Test2;

public class Main {
    public static void main(String[] args) {
        DangHuy dangHuy = new DangHuy();

        Thread thread = new Thread(dangHuy);
        thread.start();
    }
}

package Lab12.Test1;

public class Main {
    public static void main(String[] args) {
        MyThread luong1 = new MyThread("Dang Huy 1");
        luong1.start();

        MySecoundThread luong2 = new MySecoundThread("Dang Huy 2");
        luong2.start();
    }
}

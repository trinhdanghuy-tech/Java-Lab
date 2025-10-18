package Lab12.Test1;

public class MySecoundThread extends Thread {
    private String name;

    public MySecoundThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("My Secound Thread ");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(name + " is running with i = " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

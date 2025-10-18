package Lab12.Final;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Thread chạy");
            try {
                Thread.sleep(2000); // sleep 2s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Trạng thái sau khi tạo: " + t.getState()); // NEW
        t.start();
        System.out.println("Trạng thái sau start: " + t.getState()); // RUNNABLE
        Thread.sleep(100); // chờ 0.1s để đảm bảo thread t sleep
        System.out.println("Trạng thái khi sleep: " + t.getState()); // TIMED_WAITING
        t.join();
        System.out.println("Trạng thái khi kết thúc: " + t.getState()); // TERMINATED
    }
}

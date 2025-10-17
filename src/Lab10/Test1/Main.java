package Lab10.Test1;

public class Main {
    public static void main(String[] args) {
        // Dùng Enum
        MyTransaction<String, Double, TransactionStatus> t1 =
                new MyTransaction<>("TXN001", 1500.50, TransactionStatus.SUCCESS);

        // Dùng String
        MyTransaction<Integer, Integer, String> t2 =
                new MyTransaction<>(1002, 2000, TransactionStatus.FALSE.getDescription());

        t1.printInfo();
        t2.printInfo();
    }
}

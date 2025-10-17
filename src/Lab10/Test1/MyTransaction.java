package Lab10.Test1;

public class MyTransaction <ID, AMOUNT, STATUS>{
    private ID id;      //mã đơn hàng có thể là String hoặc Integer
    private AMOUNT amount;      // Số tiền có thể là Double hoặc Integer
    private STATUS status;      // Trạng thái, có thể là String("SUCCESS", "FALSE") hoặc Enum TransactionsStatus

    public MyTransaction(ID id, AMOUNT amount, STATUS status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public AMOUNT getAmount() {
        return amount;
    }

    public void setAmount(AMOUNT amount) {
        this.amount = amount;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Amount: " + amount);
        // Nếu status là enum TransactionStatus -> in mô tả tiếng Việt
        if (status instanceof TransactionStatus ts) {
            System.out.println("Trạng thái: " + ts.getDescription());
        } else {
            System.out.println("Trạng thái: " + status);
        }

        System.out.println("---------------------------");

    }
}

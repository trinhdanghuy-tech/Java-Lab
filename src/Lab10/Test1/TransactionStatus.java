package Lab10.Test1;

public enum TransactionStatus {
    SUCCESS("Thành công"),
    FALSE("Thất bại");

    public  final String description;

    TransactionStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}

package Lab7.Test2;

public enum OrderStatus {
    PENDING("Chờ xác nhận"),
    SHIPPED("Đang giao hàng"),
    DELIVERED("Đã giao"),
    CANCELLED("Đã huỷ");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasFinal() {
        if (this == CANCELLED || this == DELIVERED)
            return true;
        return false;
    }
}

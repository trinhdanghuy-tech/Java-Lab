package Lab7.Final;

public enum OderStatus {
    PENDING("Chờ xác nhận"),
    SHIPPED("Đang giao hàng"),
    DELIVERED("Đã giao"),
    CANCELLED("Đã huỷ");

    private String desc;

    OderStatus(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    public boolean hasFinal() {
        if (this == CANCELLED || this == DELIVERED)
            return true;
        return false;
    }
}

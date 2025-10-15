package Lab7.Final;

public class Oder {
    private String id;
    private OderStatus status;

    public Oder(String id, OderStatus status) {
        this.id = id;
        this.status = status;
    }

    public void processOder() {
        class Logger{
            void printInfo() {
                System.out.println("[LOG] Xử lý đơn hàng ID:" + id + " - Trạng thái: " + status.getDesc());
            }
        }

        Logger  logger = new Logger();
        logger.printInfo();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public OderStatus getStatus() {
        return status;
    }
    public void setStatus(OderStatus status) {
        this.status = status;
    }

    class CustomerInfo {
        private String name;
        private String phone;

        public  CustomerInfo(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }

        void printInfo(){
            System.out.println("Name: " + this.name);
            System.out.println("Phone: " + this.phone);
            System.out.println("Trang thai don hang: " + status.getDesc());
        }


    }

    public static class DiscountHelper {
        String calculateDiscount(OderStatus status) {
            if (status.name().equals("SHIPPED")) {
                return "Chiet khau ap dung: 10%";
            }
            if (status.name().equals("DELIVERED")|| status.name().equals("CANCELLED")) {
                return "Chiet khau ap dung: 0%";
            }
            return "Chiet khau ap dung: 5%";
        }
    }
}

package Lab7.Final;

public class Main {
    public static void main(String[] args) {


        Runnable task = new Runnable() {
          @Override
          public void run() {
              OderStatus myStatus = OderStatus.SHIPPED;

              Oder myOder = new Oder("A001", myStatus);
              myOder.processOder();

              Oder.CustomerInfo data = myOder.new CustomerInfo("Huy", "0123456");
              data.printInfo();

              Oder.DiscountHelper helper = new Oder.DiscountHelper();
              System.out.println(helper.calculateDiscount(myStatus));
              System.out.println("Đơn hàng A001 đang được xử lý ở trạng thái: Chờ xác nhận");
          }
        };
        task.run();

    }
}

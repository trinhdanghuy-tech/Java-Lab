package Lab7.Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap trang thai don hang: ");
        String status =  sc.nextLine().toUpperCase();

        try {
            OrderStatus orderStatus = OrderStatus.valueOf(status);
            System.out.println("Trang thai: " + orderStatus.getDescription());
            System.out.println("Trang thai cuoi cung: " + orderStatus.hasFinal());
        }
        catch (Exception e) {
            System.out.println("Trang thai khong hop le");
            System.out.println(status);
        }

    }
}

package Lab2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double diem = sc.nextDouble();
        if (diem >= 9.0 && diem <= 10.0) {
            System.out.println("Xuất sắc");
        }
        if (diem >= 8.0 && diem <= 9.0) {
            System.out.println("Giỏi");
        }
        if (diem >= 6.5 && diem <= 8.0) {
            System.out.println("Khá");
        }
        if (diem >= 5.0 && diem <= 6.5) {
            System.out.println("Trung bình");
        }
        if (diem >= 0 && diem <= 5.0) {
            System.out.println("Yếu");
        }
        if (diem < 0 && diem > 10) {
            System.out.println("Khng hợp lệ");
        }
    }
}

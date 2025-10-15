package Lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tong = 0;
        int dem = 0;
        double diem;
        double trungBinh = -1.0;
        while(true){
            System.out.println("===== MENU =====");
            System.out.println("1. Tính điểm trung bình");
            System.out.println("2. Phân loại học lực");
            System.out.println("3. Thoát chương trình");
            System.out.println("================");
            System.out.println("Nhập lựa chọn:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.print("Nhập điểm (từ 0 đến 10, nhập -1 để dừng): ");
                        diem = sc.nextDouble();

                        if (diem == -1) {
                            break; // kết thúc vòng lặp khi nhập -1
                        }

                        if (diem < 0 || diem > 10) {
                            System.out.println("⚠️ Điểm không hợp lệ. Nhập lại.");
                            continue; // bỏ qua phần còn lại và quay lại nhập tiếp
                        }

                        tong += diem;
                        dem++;

                    } while (true); // dùng true vì ta chủ động break khi cần

                    if (dem > 0) {
                        trungBinh = tong / dem;
                        System.out.printf("✅ Trung bình điểm = %.2f\n", trungBinh);
                    } else {
                        System.out.println("Chưa có điểm hợp lệ nào được nhập.");
                    }
                    break;
                case 2:
                    if (trungBinh >= 9.0 && trungBinh <= 10.0) {
                        System.out.println("Xuất sắc");
                    }
                    if (trungBinh > 8.0 && trungBinh <= 9.0) {
                        System.out.println("Giỏi");
                    }
                    if (trungBinh > 6.5 && trungBinh <= 8.0) {
                        System.out.println("Khá");
                    }
                    if (trungBinh > 5.0 && trungBinh <= 6.5) {
                        System.out.println("Trung bình");
                    }
                    if (trungBinh >= 0 && trungBinh <= 5.0) {
                        System.out.println("Yếu");
                    }
                    if (trungBinh < 0 || trungBinh > 10) {
                        System.out.println("Khng hợp lệ");
                    }
            }
        }
    }
}

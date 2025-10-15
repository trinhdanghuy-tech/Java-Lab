package Lab3;

import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh muốn nhập");
        int n = sc.nextInt();
        String[] tenHS = new String[n];
        double[] diemHS = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên học sinh thứ " + (i+1) + " :");
            tenHS[i] = sc.next();

            System.out.println("Nhập điểm học sinh thứ " + (i+1) + " :");
            diemHS[i] = sc.nextDouble();
            sc.nextLine();
        }
        //In ra danh sách
        for (int i = 0; i < tenHS.length; i++) {
            System.out.println(tenHS[i] + " " + diemHS[i]);
        }
        //In ra điểm trung bình của cả lớp
        double sum = 0;
        double tb = 0;
        for (int i = 0; i < tenHS.length; i++) {
            sum += diemHS[i];
            tb = sum / tenHS.length;
        }
        System.out.println("Điểm trung bình của cả lớp là: " + tb);
        System.out.println("Những bạn có điểm trên 8 là: ");
        for (int i = 0; i < tenHS.length; i++) {
            if (diemHS[i] > 8) {
                System.out.println(tenHS[i] + " " + diemHS[i]);
            }
        }
    }
}

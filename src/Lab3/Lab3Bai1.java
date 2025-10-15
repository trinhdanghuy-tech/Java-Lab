package Lab3;

import java.util.List;
import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        int[] listNumber = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nhập phần tử thứ " + i + " :");
            int input = sc.nextInt();
            listNumber[i-1] = input;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < listNumber.length; i++) {
            sum += listNumber[i];
            if (listNumber[i] > max) {
                max = listNumber[i];
            }

        }
        System.out.println("Tổng các pần tử: " + sum );
        System.out.println("số lớn nhất là: " + max);
        sc.close();
    }
}

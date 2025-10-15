package Lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh1 = sc.nextDouble();
        double theTich = Math.pow(canh1, 3);
        System.out.println("Thể tích là: " + theTich);
        sc.close();
    }
}

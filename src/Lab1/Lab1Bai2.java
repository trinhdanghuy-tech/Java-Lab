package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canh1 = sc.nextInt();
        int canh2 = sc.nextInt();
        int chuvi = (canh1 + canh2) * 2;
        int dientich = canh1 * canh2;
        int canhNhoNhat = Math.min(canh1, canh2);
        System.out.println("Chu vi là " + chuvi);
        System.out.println("Diện tích là: " + dientich);
        System.out.println("Canh nho nhat là: " + canhNhoNhat);
    }
}

package Lab2;

import java.util.Scanner;

public class NhapPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "hoidanit";
        String password;
        do {
            System.out.println("Your Password:");
            password = sc.nextLine();
            System.out.println("Nhập lại");
        }
        while (!correctPassword.equals(password));
        System.out.println("Nhập đúng r");
    }
}

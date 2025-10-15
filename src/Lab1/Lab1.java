package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        String name = input.nextLine();
        input.nextLine();
        System.out.println("Mời nhập điểm");
        double diem = input.nextDouble();
        input.close();
        System.out.println("Your name is: " + name + " Điểm số là: " + diem);

    }
}

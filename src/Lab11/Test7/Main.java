package Lab11.Test7;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void readExample() {
        try {
            byte[ ] data = Files.readAllBytes(Paths.get("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test7\\input.txt"));
            System.out.println("Đã đọc file: " + "C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test7\\input.txt");
            System.out.println("Kích thước file: " + data.length + " bytes");
            System.out.println("Giá trị byte đầu tiên: " + data[0]);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void writeFile() {
        try {
            String filePath = "C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test7\\output.txt";
            byte[ ] data = {10, 20, 30, 40, 50}; // mảng byte mẫu
            Files.write(Paths.get(filePath), data);
            System.out.println("Đã ghi file: " + filePath);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
//        readExample();
        writeFile();
    }
}

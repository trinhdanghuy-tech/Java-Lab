package Lab11.Test8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    static String sourcePath = "C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test8\\demo.mp3";
    static String destPath = "C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test8\\copy.mp3";

    public static void fileInputStream() {
        try (FileInputStream fileInputStream = new FileInputStream(sourcePath);
             FileOutputStream fileOutputStream = new FileOutputStream(destPath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            long start =   System.currentTimeMillis();
            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
            long end =   System.currentTimeMillis();
            long duration = end - start;
            System.out.println("thời gian chạy: " + duration + " ms");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileInputStream();
    }
}

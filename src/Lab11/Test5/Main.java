package Lab11.Test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void fileInputStream() {
        try (FileInputStream fis = new FileInputStream("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test5\\demo.jpg");) {
            int sizeInBytes = fis.available(); // available trả về số byte có thể đọc
            double sizeInMB = (double) sizeInBytes / (1024 * 1024);
            System.out.printf("Kích thước file: %.2f MB\n", sizeInMB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileOutputStream() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test5\\demo.jpg");
            FileOutputStream fos = new FileOutputStream("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test5\\concat.jpg");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            fis.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main (String[]args){
//            fileInputStream();
            fileOutputStream();

    }
}

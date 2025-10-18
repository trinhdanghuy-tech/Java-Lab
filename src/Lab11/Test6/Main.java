package Lab11.Test6;

import java.io.*;

public class Main {
    public static void bufferedInputStream() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test6\\demo.jpg");
            FileOutputStream fos = new FileOutputStream("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test6\\concat.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bis.close();
            bos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        bufferedInputStream();
    }
}

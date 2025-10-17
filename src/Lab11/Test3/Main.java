package Lab11.Test3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void readFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test3\\input.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile() {
        try {
            List<String> lines = Arrays.asList(
                    "Hello, java.nio.file.Files!",
                    "This is write() example."
            );
            Files.write(Paths.get("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test3\\output.txt"), lines);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile();
        writeFile();
    }
}

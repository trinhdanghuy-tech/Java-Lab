package Lab11.Test2;

import java.io.*;

public class Main {
    public static void bufferedReader() {
       try (FileReader fileReader = new FileReader("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test2\\input.txt");){

           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line = bufferedReader.readLine()) != null){
               System.out.println(line);
           }
       }
       catch (IOException e){
           System.out.println(e);
       }
    }

    public static void bufferedWriter() {
        try(FileWriter fw = new FileWriter("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test2\\output.txt");){

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello, BufferedWriter!");
            bw.newLine(); // xuống dòng
            bw.write("This is fast writing example.");
            bw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        bufferedReader();
        bufferedWriter();
    }
}

package Lab11.Test1;

import java.io.*;

public class Main {
    public static void fileReader(){
        try{
            FileReader fr = new FileReader("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test1\\text.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch(IOException e){
            System.out.println("File not found" + e.getMessage());
        }
    }
    public static void fileWriter(){
        try {
            FileWriter fw = new FileWriter("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test1\\output.txt");
            fw.write("\n");
            fw.write("Chao ban");
            fw.write("Hihi");
            fw.close();
        }
        catch (IOException e){
            System.out.println("File not found" + e.getMessage());
        }
    }

    public static void printReader(){
        try {
            PrintWriter printWriter = new PrintWriter("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test1\\output1.txt");
            printWriter.println("Chao ban");
            printWriter.close();
        }
        catch (IOException e){
            System.out.println("File not found" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        fileReader();
        fileWriter();
        printReader();
    }
}

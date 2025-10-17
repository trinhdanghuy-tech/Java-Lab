package Lab11.Test4;

import Lab11.Test4.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void handleReadFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test4\\student.txt"));
            String line;

            List<Student> students = new ArrayList<>();
            while ((line = br.readLine()) != null) {


                String[] data = line.split(",");

                double score = Double.valueOf(data[1]);

                students.add(new Student(data[0], score));

            }
            double average = 0;
            double sum = 0;
            for (Student student : students) {
                sum += student.getScore();
                average =  sum / students.size();
            }
            handleWriteFile(students, average);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void handleWriteFile(List<Student> students, double average) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Frontend\\JavaOnTap\\src\\Lab11\\Test4\\report.txt"));
            PrintWriter pw = new PrintWriter(bw);

            pw.println("====== STUDENT REPORT ======");
            pw.printf("%-12s %-7s %-8s\n", "Name", "Score", "Average");
            pw.println("-----------------------------");
            for (Student student : students) {
                String status = student.getScore() >= 5.0 ? "PASS" : "FAIL";
                pw.printf("%-12s %5.2f %-8s\n", student.getName(), student.getScore(), status);
            }
            pw.println("-----------------------------");
            pw.println("Average score: " + average);
            pw.println("=============================");
            pw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleReadFile();

    }
}

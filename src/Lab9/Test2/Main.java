package Lab9.Test2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 18));
        students.add(new Student("Đom đóm", 19));
        students.add(new Student("Thiên An", 20));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------------------------------------");
        students.add(1, new Student("KICM", 21));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------------------------------------");
        students.remove(0);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}

package Lab9.Test5;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void hashMapExample() {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(15, "Huy dep trai");
        students.put(20, "hoidanit");
        students.put(3, "harry poker");


        System.out.println(students);
    }

    public static void treeMapExample() {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(13, "Huy dep trai");
        students.put(2, "hoidanit");
        students.put(31, "harry poker");

        System.out.println(students);
    }

    public static void main(String[] args) {
        hashMapExample();
        System.out.println("--------------------");
        treeMapExample();
    }
}

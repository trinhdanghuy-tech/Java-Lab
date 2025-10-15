package Lab9.Test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void hashSetE() {
        HashSet<String> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set2.add(100);
        set2.add(2);
        set2.add(30);
        set2.add(41);


        set.add("JS");
        set.add("BE");
        set.add("Java");

        System.out.println(set);

        System.out.println(set2);
    }

    public static void treeSetE() {
        TreeSet<Integer> huydeptrai = new TreeSet<>();

        huydeptrai.add(15);
        huydeptrai.add(20);
        huydeptrai.add(100);
        huydeptrai.add(4);

        System.out.println(huydeptrai);
    }
    public static void main(String[] args) {
        hashSetE();
        System.out.println("-------------------------------");
        treeSetE();
    }
}

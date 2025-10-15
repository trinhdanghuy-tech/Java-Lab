package Lab9.Test6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void iteratorExample() {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("PHP");
        languages.add("C++");
        languages.add("JavaScript");

        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            String lang =  iterator.next();
            if (lang.equals("C#")) {
                iterator.remove();
            }
        }
        for (String language : languages) {
            System.out.println(language);
        }
//throw ConcurrentModificationException
//        for (String language : languages) {
//            if (language.equals("C#")) {
//                languages.remove(language);
//            }

    }

    public static void listIteratorExample() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(26);
        nums.add(30);
        nums.add(20);
        nums.add(50);
        ListIterator<Integer> li = nums.listIterator();


        System.out.println("Duyệt xuôi:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Duyệt ngược:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Thêm phần tử 25 vào sau 20
        li = nums.listIterator();
        while (li.hasNext()) {
            if (li.next() == 20) {
                li.add(25); // Thêm sau 20
            }
        }

        System.out.println("Sau khi thêm 25: " + nums);
    }

    public static void main(String[] args) {
        iteratorExample();
        System.out.println("------------------------");
        listIteratorExample();
    }
}

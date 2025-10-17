package Lab10.Test2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void printArrWithGenerics(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void printArrUnbound(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Huy", "Học", "Hỏi"};
        printArrWithGenerics(names);
        System.out.println("=============================");
        printArrUnbound(Arrays.asList(names));
    }
}

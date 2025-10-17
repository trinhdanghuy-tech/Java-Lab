package Lab10.Test3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printNumbers(Arrays.asList(1, 2, 3, 4));
        printNumbers(Arrays.asList(1.2, 2.3, 3.4, 4.5));
    }
}

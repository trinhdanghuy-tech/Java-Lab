package Lab9.Test4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        products.add(new Product(1, "Laptop", 1500.0));
        products.add(new Product(2, "Mouse", 20.0));
        products.add(new Product(3, "Keyboard", 45.0));

        products.add(new Product(1, "Laptop Pro", 2000.0));
        products.add(new Product(1, "Laptop", 1500.0));

        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("===========================================");
        products.remove(new Product(3, "Keyboard", 45.0));
        for (Product p : products) {
            System.out.println(p);
        }

    }
}

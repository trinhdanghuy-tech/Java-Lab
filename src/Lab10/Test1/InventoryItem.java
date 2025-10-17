package Lab10.Test1;


import java.util.ArrayList;

public class InventoryItem <T>{
    private final T id;
    private String name;

    public InventoryItem(T id, String name){
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public T getId() {
        return id;
    }
    public static void getElement() {
        InventoryItem<Integer> item1 = new InventoryItem<>(101, "Laptop");
        InventoryItem<String> item2 = new InventoryItem<>("SKU555", "Ipad");

        System.out.println(item1.getName());
        System.out.println(item2.getName());
        System.out.println(item1.getId());
        System.out.println(item2.getId());
    }

    public static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getElement();
        System.out.println("---------------------------");

        String[] names = {"Huy", "Lan", "Nam"};
        Integer[] numbers = {1, 2, 3, 4};
        printArray(names);
        printArray(numbers);
    }
}

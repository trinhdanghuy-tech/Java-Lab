package Lab10.Final;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventoryItem<Integer> listid = new InventoryItem<>(1001, "Laptop Dell", 1500.0);
        InventoryItem<String> listString = new InventoryItem<>("SKU", "Iphone 15", 1200.0);

        List<InventoryItem<?>> list = new ArrayList<>();
        list.add(listString);
        list.add(listid);


        InventoryUtils.printItemInfo(listid);
        InventoryUtils.printItemInfo(listString);
        System.out.println(InventoryUtils.calculateTotalPrice(list));
    }
}

package Lab10.Final;

import java.util.List;

public class InventoryUtils {
    public static <T> void printItemInfo(InventoryItem<T> item) {
        System.out.println(item.toString());

    }

    public static double calculateTotalPrice(List<InventoryItem<?>> items){
        double totalPrice = 0;
        for(InventoryItem<?> item2 : items) {
            totalPrice += item2.getPrice();
        }
        return totalPrice;
    }
}

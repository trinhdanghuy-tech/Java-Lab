package Lab10.Final;

public class InventoryItem<T> {
    private T id;
    private String name;
    private double price;

    public InventoryItem(T id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

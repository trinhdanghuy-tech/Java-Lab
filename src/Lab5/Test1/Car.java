package Lab5.Test1;

public class Car extends Vehicle {
    String type;

    public Car(String brand, String year, String type) {
        super(brand, year);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void start() {
        System.out.println("Starting Car");
    }
    public void honk() {
        System.out.println("Honking Car");
    }
    @Override
    public void printInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Type: " + type);
    }
}

package Lab6.Test2;

public class Vehicle {
    private String brand;

    public  Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Starting Vehicle");
    }
}

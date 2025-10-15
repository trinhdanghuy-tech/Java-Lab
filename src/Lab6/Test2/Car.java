package Lab6.Test2;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car " + getBrand() + " starting...");
    }
}

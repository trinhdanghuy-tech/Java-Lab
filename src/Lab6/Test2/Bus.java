package Lab6.Test2;

public class Bus extends Vehicle {
    public Bus(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bus " + getBrand() + " starting...");
    }
}

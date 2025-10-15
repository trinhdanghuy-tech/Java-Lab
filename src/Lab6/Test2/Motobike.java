package Lab6.Test2;

public class Motobike extends  Vehicle {
    public Motobike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Motobike " + getBrand() + " starting...");
    }
}

package Lab6.Test2;

public class MAin {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Motobike motobike = new Motobike("Honda");
        Bus bus = new Bus("Samsung");

        Vehicle[] vehicles = {car, motobike, bus};


        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

    }
}

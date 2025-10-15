package Lab5.Test1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "2022", "SUV");
        car.start();
        car.honk();
        car.printInfo();
    }
}

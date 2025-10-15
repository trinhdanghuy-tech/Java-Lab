package Lab5.Test1;

public class Vehicle {
    private String brand;
    private String year;
    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void start() {
        System.out.println("Starting Vehicle");
    }
    public void printInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
    }
}

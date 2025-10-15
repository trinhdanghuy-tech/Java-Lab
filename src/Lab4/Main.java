package Lab4;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "huy";
        emp1.salary = 100.000;
        Employee emp2 = new Employee();
        emp2.name = "hiếu";
        emp2.salary = 2000.00;
        emp1.display();
        emp2.display();
        Product p1 = new Product("Laptop", 1500.0);
        Product p2 = new Product("Smartphone", 900.0);
        p1.display();
        p2.display();
    }
}

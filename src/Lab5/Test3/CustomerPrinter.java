package Lab5.Test3;

public class CustomerPrinter {
    void print(String name) {
        System.out.println(name);
    }

    void print(String name, int age) {
        System.out.println(name + age);
    }

    void print(String name, int age, String city) {
        System.out.println(name + " " + age + " " + city);
    }
}

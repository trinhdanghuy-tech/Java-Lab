package Lab6.Test1;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    void wagTail() {
        System.out.println("Wagging tail...");
    }
}

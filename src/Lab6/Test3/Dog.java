package Lab6.Test3;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is making sound");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}

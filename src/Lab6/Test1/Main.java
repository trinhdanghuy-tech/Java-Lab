package Lab6.Test1;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting
        System.out.println(a.getClass());
        a.makeSound();
        Dog d = (Dog) a;
        a.makeSound();
        ((Dog) a).wagTail();

    }
}

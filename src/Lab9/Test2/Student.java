package Lab9.Test2;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+ name + ", Age: " + this.age;
    }
}

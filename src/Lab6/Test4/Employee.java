package Lab6.Test4;

public abstract class Employee {
    private String name;
    private String department;

    public  Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    abstract double calculateSalary();

    void print() {
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
    }
}

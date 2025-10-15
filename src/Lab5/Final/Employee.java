package Lab5.Final;

public class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void introduce() {
        System.out.println("Toi ten la: " + getName() + " , " + getAge() + " , " + this.employeeId + " , " + this.salary);
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateSalary(double bonus) {
        return salary + bonus;
    }
}

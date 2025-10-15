package Lab6.Test4;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String department, int hoursWorked, double hourlyRate) {
        super(name, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Part Time Employee");
    }
}

package Lab6.Test4;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String department, double monthlySalary) {
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return  monthlySalary;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Full Time Employee");
    }
}

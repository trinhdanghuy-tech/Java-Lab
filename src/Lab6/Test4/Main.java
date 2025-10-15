package Lab6.Test4;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Huy", "BE", 10000.0 );
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nga", "FE", 10, 200.0);
        System.out.println("Salary " + fullTimeEmployee.calculateSalary());
        System.out.println("Salary " + partTimeEmployee.calculateSalary());
    }
}

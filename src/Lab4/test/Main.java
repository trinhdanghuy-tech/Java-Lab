package Lab4.test;

import Lab4.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("hoidanit", 20, "Sales", 8000, "Vin");
        Employee emp2 = new Employee("Huy", 30, "Bán nhà", 10000, "Vin");
        System.out.println("===============Trước==============");
        emp1.display();
        System.out.println("----------------------------------");
        emp2.display();
        System.out.println("===============Sau================");
        emp1.raiseSalary(2);
        emp2.raiseSalary(1);
        emp1.display();
        System.out.println("-----------------------------------");
        emp2.display();
    }
}

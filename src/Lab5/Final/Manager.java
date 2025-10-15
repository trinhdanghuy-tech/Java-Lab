package Lab5.Final;

public class Manager extends Employee{
    private String department;

    public  Manager(String name, int age, String employeeId, double salary, String department){
        super(name, age, employeeId, salary);
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Department is "+ this.department);
    }
}

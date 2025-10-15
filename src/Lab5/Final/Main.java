package Lab5.Final;

public class Main {
    public static void main(String[] args) {
        Manager mng = new Manager("hoidanit", 25, "M001", 2000.0, "Sales");
        mng.introduce();
        System.out.println(mng.calculateSalary());
        System.out.println(mng.calculateSalary(2000.0));
    }
}

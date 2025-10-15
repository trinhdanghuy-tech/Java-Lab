package Lab5.Test3;

public class Main {
    public static void main(String[] args) {
        CustomerPrinter printer = new CustomerPrinter();
        printer.print("Huy");
        printer.print("Huy", 20);
        printer.print("Huy", 20, "Ha Noi");
    }
}

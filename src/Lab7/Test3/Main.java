package Lab7.Test3;

public class Main {
    public static void main(String[] args) {
        OuterClass user = new OuterClass("Huy", 20);
        OuterClass.InnerClass userID = new OuterClass.InnerClass("123456", "Ha Noi");

        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("CCCD: " + userID.getCccd());
        System.out.println("Address: " + userID.getAddress());
    }
}

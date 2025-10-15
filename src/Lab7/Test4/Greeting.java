package Lab7.Test4;

public class Greeting {
    public void sayHello(String name) {
        class Formatter {
            String format() {
                return "Hello, " + name + "!";
            }
        }
        Formatter f = new Formatter();
        System.out.println(f.format());
    }
}

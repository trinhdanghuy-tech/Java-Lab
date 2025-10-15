package Lab3;

public class XuLyChuoi1 {
    public static void main(String[] args) {
        String chuoi1 = " Java";
        String chuoi2 = " Script";
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(chuoi1);
        sb.append(chuoi2);
        System.out.println(sb.toString());
        System.out.println(chuoi1.concat(chuoi2));
    }
}

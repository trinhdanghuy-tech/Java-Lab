package Lab3;

public class equals {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));

        //Kinh nghiệm với Java: So sánh chuỗi → luôn dùng .equals() để so sánh nội dung/giá trị

    }
}

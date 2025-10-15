package Lab3;

public class XuLyChuoi {
    public static void main(String[] args) {
        String courses = "  JavaScript  ";
        System.out.println(courses.trim()); // xóa khoảng trắng
        System.out.println(courses.length());   // Độ dài của chuỗi cả khoảng trắng
        System.out.println(courses.charAt(4));  //Lấy ký tự thứ 4
        System.out.println(courses.substring(3,6));     //Cắt chuỗi
        System.out.println(courses.indexOf("J"));   // TÌm ký tự phần tử thứ bao nhiêu
        System.out.println(courses.toLowerCase());  // viết thường hết
        System.out.println(courses.toUpperCase());  // in hoa hết
        System.out.println(courses.contains("Java"));   //Kiểm tra xem cso trong chuỗi không nếu có trả về true

    }

}

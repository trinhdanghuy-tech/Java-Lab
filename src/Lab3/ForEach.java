package Lab3;

public class ForEach {
    public static void main(String[] args) {
        Double[] soDiem = {8.5, 7.0, 9.0, 6.5, 8.0};
        double sum = 0;
        double tb = 0;
        for (double diem : soDiem) {
            sum += diem;
            tb = sum / soDiem.length;
        }
        System.out.println("Tổng điểm: " + sum);
        System.out.println("Trung bình: " + tb);
    }
}

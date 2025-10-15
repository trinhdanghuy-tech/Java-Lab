package Lab9.Test1;

import java.util.ArrayList;

public class QuanLySinhVien {


    public static void main(String[] args) {
        ArrayList<String> sinhVien = new ArrayList<>();
        sinhVien.add("Huy");
        sinhVien.add("Nam");
        sinhVien.add("Duy");
        sinhVien.remove("Huy");

        for (String sinhvien: sinhVien){
            System.out.println(sinhvien);
        }

        ArrayList<Integer> test = new ArrayList<>();
    }
}

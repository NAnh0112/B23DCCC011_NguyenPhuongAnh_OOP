package Main1;

import java.util.Scanner;

public class Khai_Bao_Lop_Svien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    public Khai_Bao_Lop_Svien() {
        this.maSV = "B20DCCN001";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }
    private String chuanHoaNgaySinh(String ngaySinhInput) {
        String[] parts = ngaySinhInput.split("/");
        String day = "00";
        String month = "00";
        String year = "0000";

        if (parts.length == 3) {
            year = parts[2];
            day = String.format("%02d", Integer.parseInt(parts[0])); // Chuẩn hóa ngày
            month = String.format("%02d", Integer.parseInt(parts[1])); // Chuẩn hóa tháng
        }

        return day + "/" + month + "/" + year;
    }

    public void print() {
        System.out.printf("%s %s %s %s %.2f\n", maSV, hoTen, lop, ngaySinh, gpa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Khai_Bao_Lop_Svien sv = new Khai_Bao_Lop_Svien();
        sv.hoTen = sc.nextLine();
        sv.lop = sc.nextLine();
        sv.ngaySinh = sv.chuanHoaNgaySinh(sc.nextLine()); 
        sv.gpa = sc.nextFloat();
        sv.print();
    }
}

package Main1;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien() {
        this.maNV = "00001";
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maSoThue = "";
        this.ngayKyHopDong = "";
    }
    public void inThongTin() {
        System.out.printf("%s %s %s %s %s %s %s\n", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
    }

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         String hoTen = scanner.nextLine();
         String gioiTinh = scanner.nextLine();
         String ngaySinh = scanner.nextLine();
         String diaChi = scanner.nextLine();
         String maSoThue = scanner.nextLine();
         String ngayKyHopDong = scanner.nextLine();
         NhanVien nhanVien = new NhanVien();
         nhanVien.inThongTin();
    }
}
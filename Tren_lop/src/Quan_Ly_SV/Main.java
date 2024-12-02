package Quan_Ly_SV;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> danhSachSV = new ArrayList<>();
		Student sv1 = new Student("Nguyễn Văn A", 18);
		Student sv2 = new Student("Nguyễn Văn B", 18);
		Student sv3 = new Student("Nguyễn Văn C", 18);
		Classroom lop = new Classroom("D23CC03-B", danhSachSV);

		// Thêm Sinh Viên
		lop.them(sv1);
		lop.them(sv2);
		lop.them(sv3);

		lop.hienThiThongTin();
		for (Student sv : lop.getDanhSachSV()) {
			System.out.println("Tên: " + sv.getTen() + ", Tuổi: " + sv.getTuoi());
		}
		System.out.println("-------------");

		// Xóa Thông tin
		lop.xoa(sv1);
		for (Student sv : lop.getDanhSachSV()) {
			System.out.println("Tên: " + sv.getTen() + ", Tuổi: " + sv.getTuoi());
		}
	}
}

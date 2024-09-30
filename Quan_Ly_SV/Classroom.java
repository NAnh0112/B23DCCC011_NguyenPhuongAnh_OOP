package Quan_Ly_SV;

import java.util.ArrayList;

public class Classroom {
	private String lop;
	private ArrayList<Student> danhSachSV;

	public Classroom(String lop, ArrayList<Student> danhSachSV) {
		this.lop = lop;
		if (danhSachSV == null) {
			this.danhSachSV = new ArrayList<>();
		} else {
			this.danhSachSV = danhSachSV;
		}
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public ArrayList<Student> getDanhSachSV() {
		return danhSachSV;
	}

	public void setDanhSachSV(ArrayList<Student> danhSachSV) {
		this.danhSachSV = danhSachSV;
	}

	public void them(Student sv) {
		danhSachSV.add(sv);
	}

	public void xoa(Student sv) {
		danhSachSV.remove(sv);
	}

	public void hienThiThongTin() {
		System.out.println("Lớp: " + lop);

	}

}

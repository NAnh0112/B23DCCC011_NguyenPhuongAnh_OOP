package Quan_Ly_SV_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;
	
	
	public DanhSachSinhVien() {
		this.danhSach= new ArrayList<SinhVien>();
	}


	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		super();
		this.danhSach = danhSach;
	}
	//1:Thêm svien
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	
	//2: In danh sách sv
	public void inDanhSachSV() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
	//3: Ktra dsach có rỗng ko
	 public boolean kiemTraDanhSachRong() {
		 return this.danhSach.isEmpty();
	 }
	 
	 //4: Lấy ra số lg svien trong dsach
	 public int soluongSV() {
		return this.danhSach.size();
		 
	 }
	 
	 // 5: Làm rỗng danh sach
	 public void lamRonggDsach() {
		 this.danhSach.removeAll(danhSach);
	 }
	 
	 //6: Kiểm tra sinh viên có tồn tại trong dsach không, dựa trên MSV
	 public boolean kiemTraTonTai(SinhVien sv) {
		 return this.danhSach.contains(sv);
	 }
	  //7: Xóa svien dựa trên MSV
	 public boolean xoa(SinhVien sv) {
		 return this.danhSach.remove(sv);
	 }
	 
	 //8: Tìm kiếm tất vien dua tren Ten dc nhap tu bàn phím
	 public void timSVien(String ten) {
		 for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}}
		}
		
     //9 Xuát ra danh sach svien có diem từ cao đến thấp
		 public void sapXepSinhVienGiamDanTheoDiem() {
				Collections.sort(this.danhSach, new Comparator<SinhVien>() {

					@Override
					public int compare(SinhVien sv1, SinhVien sv2) {
						if(sv1.getDiemTrungBinh()< sv2.getDiemTrungBinh()) {
							return 1;
						}else if(sv1.getDiemTrungBinh()< sv2.getDiemTrungBinh()) {
							return -1;						
						} else {
							return 0;
						}
					}	
				});
			}

	}
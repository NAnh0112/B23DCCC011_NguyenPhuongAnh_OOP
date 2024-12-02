package Mang;

import java.util.Arrays;

public class So_Sanh_mang implements Comparable<So_Sanh_mang> {

    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public So_Sanh_mang(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1); 
		}else {
			return s;
		}
	}
    
    
    @Override
	public String toString() {
		return "So_Sanh_mang [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
    public int compareTo(So_Sanh_mang other) {
        //>0, <0, =0
        //return this.maSinhVien - other.maSinhVien;
    	
    	
    	//// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
    	String tenThis = this.getTen();
		String tenO=other.getTen();
		return tenThis.compareTo(tenO);
    	
    }

    public static void main(String[] args) {
        So_Sanh_mang sv1 = new So_Sanh_mang(100, "Nguyễn Văn A", "Lop 1", 9);
        So_Sanh_mang sv2 = new So_Sanh_mang(150, "NguyễN Văn Y", "Lop 12", 8);
        So_Sanh_mang sv3 = new So_Sanh_mang(90, "Nguyen Văn H", "Lop 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3)); 
		System.out.println(sv2.compareTo(sv3)); 
		
		So_Sanh_mang[] a_sv = new So_Sanh_mang[] {sv1,sv2,sv3};
		System.out.println("BDau: "+ Arrays.toString(a_sv));
		//hàm sxep
		Arrays.sort(a_sv);
		System.out.println("Sau khi sxep: "+ Arrays.toString(a_sv));
    
        //Hàm tìm kiếm
		System.out.println("Tìm kiếm sv1: "+ Arrays.binarySearch(a_sv,sv1));
    
    
    
    }
}

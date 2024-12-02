package Quan_Ly_Sach; 
public class Tac_Gia { 
	private String tenTacGia; 
	private Ngay ngaySinh; 
	public Tac_Gia(String tenTacGia, Ngay ngaySinh) { 
		this.tenTacGia = tenTacGia; 
		this.ngaySinh = ngaySinh; 
	} 

	public String getTenTacGia() { 
		return tenTacGia; 
	} 

	public void setTenTacGia(String tenTacGia) { 
		this.tenTacGia = tenTacGia; 
	} 

	public Ngay getNgaySinh() { 
		return ngaySinh; 
	} 

	public void setNgaySinh(Ngay ngaySinh) { 
		this.ngaySinh = ngaySinh; 

	} 
} 
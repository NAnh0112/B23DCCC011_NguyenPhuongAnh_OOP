package Quan_Ly_Sach; 
public class Sach { 
	private String tenSach; 
	private double giaBan; 
	private int namXuatBan; 
	private Tac_Gia tacGia; 

	public Sach(String tenSach, double giaBan, int namXuatBan, Tac_Gia tacGia) { 
		this.tenSach = tenSach; 
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan; 
		this.tacGia = tacGia; 

	} 
	public String getTenSach() { 

		return tenSach; 

	} 

 

	public void setTenSach(String tenSach) { 

		this.tenSach = tenSach; 

	} 

 

	public double getGiaBan() { 

		return giaBan; 

	} 

 

	public void setGiaBan(double giaBan) { 

		this.giaBan = giaBan; 

	} 

 

	public int getNamXuatBan() { 

		return namXuatBan; 

	} 

 

	public void setNamXuatBan(int namXuatBan) { 

		this.namXuatBan = namXuatBan; 

	} 

 
	public Tac_Gia getTacGia() { 

		return tacGia; 

	} 

 
	public void setTacGia(Tac_Gia tacGia) { 

		this.tacGia = tacGia; 

	} 


	public void inTenSach() { 

		System.out.println(this.tenSach); 

	} 


	public boolean kienTraCungNamXuatBan(Sach sachKhac) { 

		/*if (this.namXuatBan==sachKhac.namXuatBan) { 

			return true; 

		}else {return false;}*/ 

		 return this.namXuatBan==sachKhac.namXuatBan; 

	} 

	 

	public double giaSauKhiGiam(double x) { 

		return this.giaBan*(1-x/100); 

	} 

	 

} 
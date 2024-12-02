package main;

public class hoaDonCoffee {
	private String tenLoaiCaPhe; 
	private double giaTien1Kg; 
	private double khoiLuong; 
	// Construrter 
	public hoaDonCoffee(String ten, double gia, double kl) { 
		this.tenLoaiCaPhe = ten; 
		this.giaTien1Kg = gia; 
		this.khoiLuong = kl; 
		} 

	public double tinhTongTien() { 
		return this.giaTien1Kg * this.khoiLuong;// return được sử dụng để trả về kết quả của phép tính 
	} 

	public boolean ktraKhoiLuongLonHon(double kl) { 
		return this.khoiLuong > kl; 
	} 

	public boolean ktraHoaDonLonHon500K() { 
		return this.tinhTongTien() > 500; 
	} 

	public double giamGia (double x) { 
		if(this.tinhTongTien()>500) { 
			return (x/100)*this.tinhTongTien(); 
			} 
		else {return 0;}	 
	} 

	public double giaSauKhiGiam(double x) { 
		return this.tinhTongTien()-this.giamGia(x); 
	} 

	public static void main(String[] args) { 
		hoaDonCoffee hd = new hoaDonCoffee("Trung Nguyen", 100, 1.5); 
		hoaDonCoffee hd2 = new hoaDonCoffee("Vina", 100, 5.5); 
		System.out.println("Tong tien hoa dơn là: " + hd.tinhTongTien()); 
		System.out.println("Tong tien hoa dơn 2 là: " + hd2.tinhTongTien()); 
		System.out.println("Kiểm tra khoi luong > 2kg: " + hd.ktraKhoiLuongLonHon(2)); 
		System.out.println("Kiểm tra hoa don > 500k: " + hd.ktraHoaDonLonHon500K()); 
		System.out.println("Giam gia cua Hd:" +hd.giamGia(10)); 
		System.out.println("Giam gia cua Hd2:" +hd2.giamGia(10));
	    System.out.println("Hoa Don sau khi giam gia cua Hd:" +hd.giaSauKhiGiam(10)); 
	    System.out.println("Hoa Don sau khi giam gia cua Hd2:" +hd2.giaSauKhiGiam(10)); 
	} 
} 

 


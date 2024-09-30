package Quan_Ly_Sach; 
public class Test { 
	public static void main(String[] args) { 
		Ngay ngay1= new Ngay(15,5,2024); 
		Ngay ngay2= new Ngay(16,2,2024); 
		Ngay ngay3= new Ngay(15,5,2030); 

		Tac_Gia tacGia1= new Tac_Gia("Phương Anh", ngay1); 
		Tac_Gia tacGia2= new Tac_Gia("Lan Anh", ngay2); 
		Tac_Gia tacGia3= new Tac_Gia("Trang Anh", ngay3); 

		Sach sach1 = new Sach("Lap trinh C", 5000, 2023, tacGia1); 
		Sach sach2 = new Sach("Lap trinh Java", 10000, 2025, tacGia2); 
		Sach sach3 = new Sach("Lap trinh C++", 15000, 2023, tacGia3); 

		sach1.inTenSach(); 
		sach2.inTenSach(); 
		sach3.inTenSach(); 

		System.out.println("So sanh nam xuat ban 1 và 3: " + sach1.kienTraCungNamXuatBan(sach3)); 
		System.out.println("So sanh nam xuat ban 1 và 2: " + sach1.kienTraCungNamXuatBan(sach2)); 
		System.out.println("So sanh nam xuat ban 2 và 3: " + sach2 .kienTraCungNamXuatBan(sach3)); 

		System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10)); 
		System.out.println("Sach 2 giam 20%: " + sach2.giaSauKhiGiam(20)); 
		System.out.println("Sach 3 giam 10%: " + sach3.giaSauKhiGiam(10)); 
	} 
} 

 
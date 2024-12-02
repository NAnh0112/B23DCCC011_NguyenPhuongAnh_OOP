package Xu_ly_chuoi;

public class Cac_ham_tim_kiem_chuoi {
	public static void main(String[] args) {
		String s1="Xin chào, mọi người có khỏe , Xin chào";
		String s2="Xin chào";
		String s3="Xin chào 123";
		char c1='i';
		
		//hàm indexOf ==> Tìm kiếm từ trái sang phải
		//Trả về vị trí thứ s2 tròn s1
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s3)); // không tìm thấy vị trí sẽ trả về giá trị âm
		System.out.println(s1.indexOf(s2,2));  // Sử dụng vị trí bắt đầu
		System.out.println(s1.indexOf(c1));
		
		
		//Hàm lastIndexof ==> Tìm kiếm từ phải sang trái
		
		
		//ten file baitap.doc.lop12.exl==> last
	}
}

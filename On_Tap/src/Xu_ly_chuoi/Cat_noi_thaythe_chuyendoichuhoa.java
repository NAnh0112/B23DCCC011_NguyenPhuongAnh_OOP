package Xu_ly_chuoi;

public class Cat_noi_thaythe_chuyendoichuhoa {
	public static void main(String[] args) {
		String s1 ="tItv";
		String s2=".vn";
		
		String s3=s1+s2;
		//Hàm concat => nối chuỗi
		String s4 = s1.concat(s2);
		System.out.println("s3= "+ s3);
		System.out.println("s4= "+ s4);
		
		//Hàm replace => thay thế
		String s5 = "Phuong Anh";
		System.out.println("s6 = "+ s5.replaceAll("Phuong", "123"));
		
		//Hàm toLowerCase => chuyển về viết thường
		//Hàm toUpperCase => chuyển về viết hoa
		System.out.println("s7= "+ s5.toLowerCase());
		System.out.println("s8= "+ s5.toUpperCase());
		
		
		//Hàm trim => xóa khoảng trắng dư thừa wở đầu chuỗi
		String s9 ="     Xin chào mọi người, em là:    ";
		System.out.println("s10= "+ s9.trim());
		
		
		//Hàm subTring => Cắt chuỗi con
		String s11="Xin chào mọi người, em là:    ";
		System.out.println("s12= "+ s11.substring(10));
		System.out.println("s12= "+ s11.subSequence(8, 17));
	}
}

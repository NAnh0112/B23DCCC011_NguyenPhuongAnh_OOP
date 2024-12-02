package Xu_ly_chuoi;

import java.util.Scanner;

public class Lay_do_dai_va_ky_tu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("-----");
		
		//Hàm Length()==>lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai= s.length()	;
		System.out.println("-----------");
		
		
		
		//Hàm CharAt()==> Lấy 1 ký tự ở vị trí bất kỳ
		for(int i=0; i<s.length(); i++) {
			System.out.println("Vị trí thứ "+(i+1)+" là: "+s.charAt(i));
		}
		System.out.println("-----------");
		
		
		
		//HÀM getchar(ví trí bắt đầu, vị trí kết thúc, mảng lưu dlieu,vị trí bắt đầu lưu của mảng)==> lấy ra và thay thế
		char[] arrayChar = new char[15];
		s.getChars(2, 8, arrayChar, 0);
		for (int i=0; i<arrayChar.length;i++) {
			System.out.println("Gía trị của mảng tại "+(i)+" là: "+arrayChar[i]);
		}
		
		
		System.out.println("-----------");
		
		
		
	}
}

package main;

import java.util.Scanner;

public class Chuoi_trung_nhau {
	// Kiểm tra lỳ tự đầu và cuối có trùng nhau ko
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi:");
		String st = sc.nextLine();
		if (st.charAt(0) == st.charAt(st.length() - 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

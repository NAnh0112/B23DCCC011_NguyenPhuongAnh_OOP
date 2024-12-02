package main;

import java.util.Scanner;

public class ChuyenDoiNhiPhan {
	public static void main(String[] args) {
		/*
		 * Chia liên tục cho 2 và lấy phần dư
		 * 
		 * Đảo ngược chuỗi ==> kết quả
		 * 
		 * 10:2=5b dư 0
		 * 
		 * 5:2=2 dư 1
		 * 
		 * 2:2=1 dư 0
		 * 
		 * 1:2=0 dư 1
		 * 
		 * ==> kết quả: 1010
		 * 
		 */

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập số cần chuyển đổi: ");

		n = sc.nextInt();

		String nhiphan = "";

		while (n > 0) {

			nhiphan = (n % 2) + nhiphan;

			n = n / 2;

		}

		System.out.println("Số hệ nhi phận là: " + nhiphan);

	}

}

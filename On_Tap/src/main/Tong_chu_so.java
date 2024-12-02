package main;

import java.util.Scanner;

public class Tong_chu_so {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("N: ");
		String N= sc.nextLine();
		
		int kq=0;	
		for (int j = 0; j < N.length(); j++) {
			 kq += Character.getNumericValue(N.charAt(j));  // Chuyển ký tự thành số
		}
		System.out.println(kq);
	}
}

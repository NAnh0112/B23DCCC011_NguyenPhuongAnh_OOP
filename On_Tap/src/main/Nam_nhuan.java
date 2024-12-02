package main;

import java.util.Scanner;

public class Nam_nhuan {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập vào năm kiểm tra: ");
		int year = sc.nextInt();
		if (year % 4==0) {
			if (year %100==0) {
				if (year% 400 ==0) {
					System.out.println("YES");
				} else {
					System.out.println("No");
				}
				
			} else {System.out.println("YES");

			}
		} else {System.out.println("No");

		}
	}
}

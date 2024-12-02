package main;

import java.util.Scanner;

public class So_thuan_nghich {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("N: ");
		int N=sc.nextInt();
		int m =0;
		for (int i = N; i >0; i/=10) {
			m = m* 10 + i%10;
		}
		if (m==N) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}
	
		
	}
	
}

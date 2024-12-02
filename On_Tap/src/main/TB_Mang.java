package main;

import java.util.Scanner;

public class TB_Mang {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Số phần tử của mảng: ");
		int n=sc.nextInt();
		int m[]= new int[n];
		for (int i = 0; i < m.length; i++) {
			System.out.println("Phần tử thứ "+(n+1));
			m[i]=sc.nextInt();
		}
		int sum=0;
		for (int a = 0; a < m.length; a++) {
			sum +=a;
		}
		double TBC =(double)sum/m.length;
		System.out.println("Gía trị trung bình của mảng: "+TBC);
	}
}

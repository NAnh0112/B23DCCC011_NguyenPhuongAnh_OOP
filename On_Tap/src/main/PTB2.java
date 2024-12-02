package main;

import java.util.Scanner;

public class PTB2 {
	public static void main(String[] args) {

		/*
		 * double a,b,c,x1,x2,delta;
		 * 
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * System.out.println("Gía trị của a: ");
		 * 
		 * a= sc.nextDouble();
		 * 
		 * System.out.println("Gía trị của b: ");
		 * 
		 * b= sc.nextDouble();
		 * 
		 * System.out.println("Gía trị của c: ");
		 * 
		 * c= sc.nextDouble();
		 * 
		 * 
		 * 
		 * delta = Math.pow(b, 2) - 4*a*c;
		 * 
		 * if (delta<0) {
		 * 
		 * System.out.println("Phương trình vô nghiệm");
		 * 
		 * }
		 * 
		 * else if( delta==0) {
		 * 
		 * x1=x2=-b/2*a;
		 * 
		 * System.out.println("Phương trình có kép: x1= x2 = "+x1);
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * x1=(-b- Math.sqrt(delta))/(2*a);
		 * 
		 * x2=(-b+ Math.sqrt(delta))/(2*a);
		 * 
		 * System.out.println("Phương trình có 2 nghiệm phân biệt: x1="+x1 +"x2="+x2);
		 * 
		 * }
		 */

		// Phuong trình bậc nhất

		double a, b, x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap a: ");

		a = sc.nextDouble();

		System.out.println("Nhap b: ");

		b = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vô số nghiệm");
			} else {
				System.out.println("Phuong trình vô nghiệm");
			}
		} else {
			x = -b / a;
			System.out.println("Nghiệm của phuong trình là: " + x);
		}
	}
}
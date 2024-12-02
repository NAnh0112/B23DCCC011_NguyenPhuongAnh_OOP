package main;

import java.util.Scanner;

public class Giai_thua {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập n: ");
		int i = sc.nextInt();
		long a=1;
		for (int j = 1; j <= i; j++) {
			a *= j;
		}
		System.out.println("Giai thừa của "+i +"là: "+a);
    
			
		}
	}



package main;

import java.util.Scanner;

public class Fibonacci {
    
    public static int A(int n) {
        if (n == 0 ) {
            return 0;
        } 
        if (n == 1 ) {
            return 1;
        } 
        return A(n - 1) + A(n - 2);
    }
    	
	public static void main(String[] args) {
		  System.out.print("Nhập số nguyên dương n = ");
		  Scanner sc= new Scanner(System.in);
		  int i=sc.nextInt();
		  for (int j = 0; j <= i; j++) {
			  System.out.println("số Fibonacci thứ: "+j+" là: "+A(j));
		  }
		  
	}
	/* public static void main(String[] args) {
	System.out.print("Nhập số nguyên dương n: ");
	int n = scanner.nextInt(); 
	if (i < 0 || i > 20) {
	      System.out.println("Nhập lại");
	  } else {
	      System.out.println("Số Fibonacci thứ " + i + " là: " + A(i));
	  }
	  sc.close(); 
	}*/
}
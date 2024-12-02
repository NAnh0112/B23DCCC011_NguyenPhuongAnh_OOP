package Main1;

import java.util.Scanner;

public class HCN {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int length = scanner.nextInt();
	        int width = scanner.nextInt();

	        if (length <= 0 || width <= 0) {
	            System.out.println("0");
	            return;
	        }

	        int perimeter = 2 * (length + width);
	        int area = length * width;
	        System.out.println(perimeter + " " + area);
	    }
	}
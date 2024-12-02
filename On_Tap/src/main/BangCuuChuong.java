package main;

public class BangCuuChuong {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		/*
		 * Scanner scanner = new Scanner(System.in); 
		 * int N = scanner.nextInt(); 
		 * for (int i = 1; i <= 10; i++) { 
		 *          int result = N * i; 
		 *          System.out.println(N + " x " + i + " = " + result); }
		 */
	}
}
package Main1;

import java.util.Scanner;

public class So_Lien_Ke {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            String 	A = sc.nextLine();
            boolean N = true; 
            for (int j = 0; j < A.length() - 1; j++) {
                if (Math.abs(A.charAt(j) - A.charAt(j + 1)) != 1) {
                    N = false; 
                    break; 
                }
            }
            System.out.println(N ? "YES" : "NO");
        }
    }
}
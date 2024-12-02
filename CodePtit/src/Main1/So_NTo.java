package Main1;

import java.util.Scanner;

public class So_NTo {
	public static boolean A(long n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for (int t = 0; t < numTests; t++) {
            long N = sc.nextLong();             
            if (A(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

package Main1;

import java.util.Scanner;

public class UCLN {
	private static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }
	private static long BCNN(int a, int b) {
        return (long) a * b / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(BCNN(a, b) + " " + UCLN(a, b));
        }
    }
}

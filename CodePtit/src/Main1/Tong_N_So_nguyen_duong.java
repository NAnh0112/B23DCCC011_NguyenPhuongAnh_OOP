package Main1;

import java.util.Scanner;

public class Tong_N_So_nguyen_duong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            long sum = (long) n * (n + 1) / 2;
            System.out.println(sum);
        }
	}
}

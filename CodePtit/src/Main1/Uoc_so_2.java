package Main1;

import java.util.Scanner;

public class Uoc_so_2 {
    public static int A(long N) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i % 2 == 0) {
                    cnt++;
                }
                if (i != N / i && (N / i) % 2 == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong(); 
            int result = A(N); 
            System.out.println(result); }
    }
}

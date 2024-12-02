package Main1;

import java.util.Scanner;

public class Tinh_so_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fib = new long[93]; 
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            System.out.println(fib[n]); 
    }
    }}


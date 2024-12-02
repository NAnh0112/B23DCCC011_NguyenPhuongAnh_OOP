package main;

import java.util.Scanner;

public class So_NTo {
    public static boolean A(int n) {
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
        System.out.print("Nhập vào số nguyên n ");
        int n = sc.nextInt();
        System.out.println("Các số nguyên tố từ 0 đến " + n + " là:");
        for (int i = 0; i <= n; i++) {
            if (A(i)) {
                System.out.print(i + " ,");
            }
        }
        System.out.println(); 
    }
    
    
 
}

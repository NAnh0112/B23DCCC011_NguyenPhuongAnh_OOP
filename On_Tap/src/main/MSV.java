package main;
import java.util.Scanner;

public class MSV {
    public static void main(String[] args) {
        String[] MSV = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập vào MSSV thứ " + (i + 1) + ":");
            MSV[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (!MSV[i].matches("B170[1-9]{4}")) {
                System.out.println("MSSV thứ " + (i + 1) + " sai định dạng!");
            } else {
                System.out.println("MSSV thứ " + (i + 1) + " hợp lệ!");
            }
        }
    }
}

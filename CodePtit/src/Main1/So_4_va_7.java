package Main1;
import java.util.Scanner;
public class So_4_va_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        String N = sc.nextLine();
        int kq = 0; 
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if (c == '4' || c == '7') {
                kq++; 
            }
        }

        if (kq == 4 || kq == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
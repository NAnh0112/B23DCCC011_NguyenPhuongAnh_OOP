package Main1;
import java.util.Scanner;

public class Tong_GThua {
		public static long tinhgiaithua(int n) {
			long t=1;
			for(int i=1;i<=n;i++) {
				t*=i;
			}
			return t;
		}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		long sum=0;
		for(int r=1;r<=n;r++) {
			sum+= tinhgiaithua(r);
		}
		System.out.println(sum);
	}
	}
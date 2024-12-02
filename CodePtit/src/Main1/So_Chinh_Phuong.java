package Main1;
import java.util.Scanner;
public class So_Chinh_Phuong {
	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
		 int testcase = scn.nextInt();
		 for(int i=0;i<testcase;i++) {
			 int n= scn.nextInt();
			 int fl= (int) Math.floor(Math.sqrt(n));
			 if (Math.pow(fl,2)==n) {
				 System.out.println("YES");
			 }
			 else {
				 System.out.println("NO");
			 }
		 }
	}

}

package main; 
import java.util.Scanner; 

 

public class Try_Cathch{ 

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in); 

		int n=0; 

		/*try { 

			System.out.println("Nhập vào số nguyên n: "); 

			n= sc.nextInt(); 

		} catch (Exception e) { 

			System.out.println("Gía trị nhập không đúng"); 

		}*/ 

		 

		try { 

			System.out.println("Nhập vào số nguyên n: "); 

			n= sc.nextInt(); 

		} catch (Exception e) { 

			System.out.println("Gía trị nhập không đúng"); 

			 

		} finally { 

			System.out.println("Finally!"); 

		} 

		 

		System.out.println("Gía trị nhập là: "+n); 

		System.out.println("Kết thúc chương trình: "); 

	} 

} 

 

 
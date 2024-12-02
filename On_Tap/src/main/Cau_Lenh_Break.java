package main;

public class Cau_Lenh_Break {
	public static void main(String[] args) {
		int out, in; 
		for (out = 0; out < 10; out++) { 
			for (in = 0; in < 20; in++) { 
				if (in > 10) { 
					break; 
					} 
				System.out.println("Bên trong vòng lặp lớn: out=" + out + ", in= " + in); 
				} 
			System.out.println("Vòng lặp bên ngoài: out= " + out + ", in=" + in);  
			} 
		} 
	}

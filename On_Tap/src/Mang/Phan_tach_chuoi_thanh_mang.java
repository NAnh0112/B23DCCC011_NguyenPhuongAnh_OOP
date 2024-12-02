package Mang;

import java.util.Arrays;

public class Phan_tach_chuoi_thanh_mang {
	public static void main(String[] args) {
		String s= "Xin chào các bạn, tôi là Anh";
		String[] a=s.split(" ");
		System.out.println( Arrays.toString(a));
		
		
		String[] b=s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình là Anh. Rất vui được gặp";
		String [] c= s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
}}

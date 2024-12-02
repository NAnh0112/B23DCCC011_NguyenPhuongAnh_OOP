package Xu_ly_chuoi;

public class So_sanh_chuoi {
	public static void main(String[] args) {
		String s1= "Phương Anh";
		String s2= "phương anh";
		String s3= "Phương Anh";
		
		//Hàm equals==> so sánh 2 chuỗi giống nhau(phân biệt chữ hoa)
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equals s3: "+s1.equals(s3));
		System.out.println("----------");
		
		
		// Hàm equalsIgnoreCase==> ko phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: "+s1.equalsIgnoreCase(s3));
		System.out.println("----------");
		
		
		// Hàm compareTo==> so sánh <>=
		String sv1="Nguyễn Văn A";
		String sv2="Nguyễn Văn B";
		String sv3="Nguyễn Văn ";
		String sv4="Nguyễn Văn A";		
		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
		System.out.println("----------");
		
		
	
		//Hàm compareToIgnoreCase => Tương tự với compareTo, phân biệt hoa thường
		
		
		// Hàm regionMatches => so sánh 1 đoạn
		String r1 ="TITV.vn";
		String r2 ="TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		System.out.println("----------");
		
		
		
		//Hàm startWith => kiểm tra chuỗi bắt đầu bằng...
		String sdt1 ="037456789";
		System.out.println(sdt1.startsWith("037"));
		
		
		
		//Hàm endtWith => kiểm tra chuỗi kết thúc  bằng...
		
	}
	
}

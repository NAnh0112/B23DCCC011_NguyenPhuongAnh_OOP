package KeThua_Abstract;

public class main {
	public static void main(String[] args) {
		HangSX h1 = new HangSX("Hãng 1", "Việt Nam");
		HangSX h2 = new HangSX("Hãng 2", "Mỹ");
		HangSX h3 = new HangSX("Hãng 3", "Anh");
		
		PhuongTienDiChuyen p1= new MayBay("Xăng",h1 );
		PhuongTienDiChuyen p2= new OTo("Xăng",h2 );
		PhuongTienDiChuyen p3= new XeDap(h3 );
		
		System.out.println("Lấy hãng SX");
		System.out.println("p1: "+p1.layTenHangSX());
		
		System.out.println("Bắt đầu");
		p2.batDau();
		
		System.out.println("Lấy vận tốc");
		System.out.println("p1: "+p1.layVToc());
		System.out.println("p2: "+p2.layVToc());
		System.out.println("p3: "+p3.layVToc());
		
	}
	
	};

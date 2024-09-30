package KeThua_Abstract;

public class MayBay extends PhuongTienDiChuyen {

	private String loaiNhienLieu;

	public MayBay(String loaiNhienLieu,HangSX hangSX) {
		super("MayBay", hangSX );
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVToc() {
		return 500;
	}
	
	public void catCanh() {
		System.out.println("Cất cánh");
	}
	
	public void haCanh() {
		System.out.println("Hạ cánh");
	}
	
	
}

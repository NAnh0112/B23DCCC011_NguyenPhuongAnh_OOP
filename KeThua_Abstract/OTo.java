package KeThua_Abstract;

public class OTo extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public OTo( String loaiNguyenLieu,HangSX hangSX) {
		super("OTo", hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getloaiNhienLieuu() {
		return loaiNhienLieu;
	}

	public void setloaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVToc() {		
		return 200;
	}
	

}

package KeThua_Abstract;

public abstract class PhuongTienDiChuyen {
	protected String tenLoaiPhuongTien;
	protected HangSX hangSX;
	
	public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSX hangSX) {
		
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSX = hangSX;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public HangSX getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}
	
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
	 
	public void batDau() {
		System.out.println("Bắt đầu");
	}
	
	public void tangToc() {
		System.out.println("Tăng tốc");
	}
	
	public void dungLai() {
		System.out.println("Dừng lại");
	}
	
	public abstract double layVToc();
	
	
	 
}

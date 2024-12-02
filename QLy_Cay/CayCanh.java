package QLy_Cay;

public class CayCanh {
	private String tenCay;
	private String loaiCay;
	private double chiPhiChamSoc;
	public CayCanh(String tenCay, String loaiCay, double chiPhiChamSoc) {
		this.tenCay = tenCay;
		this.loaiCay = loaiCay;
		this.chiPhiChamSoc = chiPhiChamSoc;
	}
	public String getTenCay() {
		return tenCay;
	}
	public void setTenCay(String tenCay) {
		this.tenCay = tenCay;
	}
	public String getLoaiCay() {
		return loaiCay;
	}
	public void setLoaiCay(String loaiCay) {
		this.loaiCay = loaiCay;
	}
	public double getChiPhiChamSoc() {
		return chiPhiChamSoc;
	}
	public void setChiPhiChamSoc(double chiPhiChamSoc) {
		this.chiPhiChamSoc = chiPhiChamSoc;
	}
	
	
}

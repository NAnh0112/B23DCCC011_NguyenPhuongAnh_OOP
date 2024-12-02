package QLy_Cay;

public class CayNgoaiTroi extends CayCanh {
	public CayNgoaiTroi(String tenCay, String loaiCay, double chiPhiChamSoc) {
		super(tenCay, loaiCay, chiPhiChamSoc);
	}

	private String yeuCauDoAm;

	public CayNgoaiTroi(String tenCay, String loaiCay, double chiPhiChamSoc, String yeuCauDoAm) {
		super(tenCay, loaiCay, chiPhiChamSoc);
		this.yeuCauDoAm = yeuCauDoAm;
	}

	public String getYeuCauDoAm() {
		return yeuCauDoAm;
	}

	public void setYeuCauDoAm(String yeuCauDoAm) {
		this.yeuCauDoAm = yeuCauDoAm;
	}
	
	

}

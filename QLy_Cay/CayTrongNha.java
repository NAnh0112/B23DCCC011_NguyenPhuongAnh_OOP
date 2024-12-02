package QLy_Cay;

public class CayTrongNha extends CayCanh {

	public CayTrongNha(String tenCay, String loaiCay, double chiPhiChamSoc) {
		super(tenCay, loaiCay, chiPhiChamSoc);
	}
	private String yeuCauAS;

	public CayTrongNha(String tenCay, String loaiCay, double chiPhiChamSoc, String yeuCauAS) {
		super(tenCay, loaiCay, chiPhiChamSoc);
		this.yeuCauAS = yeuCauAS;
	}

	public String getYeuCauAS() {
		return yeuCauAS;
	}

	public void setYeuCauAS(String yeuCauAS) {
		this.yeuCauAS = yeuCauAS;
	}
	
	

}

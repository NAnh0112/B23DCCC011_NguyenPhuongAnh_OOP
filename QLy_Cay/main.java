package QLy_Cay;

public class main {
	public static void main(String[] args) {
		DichVu dv = new DichVu();
		
		CayTrongNha tn = new CayTrongNha("Cây Xương Rồng"," Cây trong nhà", 300000, "Yếu");
		CayTrongNha tn2 = new CayTrongNha("Cây hoa hồng"," Cây trong nhà", 700000, "Yếu");
		CayNgoaiTroi nt = new CayNgoaiTroi("Cây Mai", "Cây ngoài trời" , 500000, "Trung Bình");
		CayNgoaiTroi nt2 = new CayNgoaiTroi("Cây bàng", "Cây ngoài trời" , 200000, "Cao");
		
		
		dv.themCay(tn);
		dv.themCay(nt);
		dv.themCay(tn2);
		dv.themCay(nt2);
		
		dv.hienthi();
		double tongChiPhi = dv.tinhTongChiPhiChamSoc();
		System.out.println("Tổng chi phí chăm sóc hàng tháng: " + tongChiPhi + " VNĐ");
		
		dv.hienThiCayCaoNhatVaThapNhat();
	}
}

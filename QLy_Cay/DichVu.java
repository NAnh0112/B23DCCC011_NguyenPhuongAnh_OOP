package QLy_Cay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DichVu {
	private List<CayCanh> danhSachCay;
	
	public DichVu() {
		danhSachCay = new ArrayList<CayCanh>();
	}
	
	public void themCay(CayCanh cay) {
		danhSachCay.add(cay);
	}
	
	public double tinhTongChiPhiChamSoc() {
		double tongChiPhi = 0;
		for (CayCanh cay : danhSachCay) {
			tongChiPhi += cay.getChiPhiChamSoc();
		}
		return tongChiPhi;
	}
	
	 public CayCanh timCayThapNhat(String loai) {
	        CayCanh cayThapNhat = null;
	        for (CayCanh cay : danhSachCay) {
	            if (loai.equals("trong nhà") && cay.getClass() == CayTrongNha.class) {
	                if (cayThapNhat == null || cay.getChiPhiChamSoc() < cayThapNhat.getChiPhiChamSoc()) {
	                    cayThapNhat = cay;
	                }
	            } else if (loai.equals("ngoài trời") && cay.getClass() == CayNgoaiTroi.class) {
	                if (cayThapNhat == null || cay.getChiPhiChamSoc() < cayThapNhat.getChiPhiChamSoc()) {
	                    cayThapNhat = cay;
	                }
	            }
	        }
	        return cayThapNhat;
	   }
	 
	 public CayCanh timCayCaoNhat(String loai) {
	        CayCanh cayCaoNhat = null;
	        for (CayCanh cay : danhSachCay) {
	            if (loai.equals("trong nhà") && cay.getClass() == CayTrongNha.class) {
	                if (cayCaoNhat == null || cay.getChiPhiChamSoc() > cayCaoNhat.getChiPhiChamSoc()) {
	                    cayCaoNhat = cay;
	                }
	            } else if (loai.equals("ngoài trời") && cay.getClass() == CayNgoaiTroi.class) {
	                if (cayCaoNhat == null || cay.getChiPhiChamSoc() > cayCaoNhat.getChiPhiChamSoc()) {
	                    cayCaoNhat = cay;
	                }
	            }
	        }
	        return cayCaoNhat;
	    }
	
	public void hienthi() {
		for (CayCanh cay : danhSachCay) {
	        String thongTin = "";

	        if (cay.getClass() == CayTrongNha.class) {
	            thongTin = "Loại - Cây trong nhà, Ánh sáng yêu cầu: " + ((CayTrongNha) cay).getYeuCauAS();
	        } else if (cay instanceof CayNgoaiTroi) {
	            thongTin = "Loại - Cây ngoài trời, Độ ẩm yêu cầu: " + ((CayNgoaiTroi) cay).getYeuCauDoAm();
	        }

	        System.out.printf("%s: %s, Chi phí chăm sóc: %.0f VNĐ\n", 
	            cay.getTenCay(), 
	            thongTin, 
	            cay.getChiPhiChamSoc());
	    }
	}
	
	public void hienThiCayCaoNhatVaThapNhat() {
        CayCanh cayTrongNhaCaoNhat = timCayCaoNhat("trong nhà");
        CayCanh cayTrongNhaThapNhat = timCayThapNhat("trong nhà");
        CayCanh cayNgoaiTroiCaoNhat = timCayCaoNhat("ngoài trời");
        CayCanh cayNgoaiTroiThapNhat = timCayThapNhat("ngoài trời");

        System.out.println("Cây trong nhà có chi phí chăm sóc cao nhất: " + (cayTrongNhaCaoNhat != null ? cayTrongNhaCaoNhat.getTenCay() + " - " + cayTrongNhaCaoNhat.getChiPhiChamSoc() + " VNĐ" : "Không có cây nào."));
        System.out.println("Cây trong nhà có chi phí chăm sóc thấp nhất: " + (cayTrongNhaThapNhat != null ? cayTrongNhaThapNhat.getTenCay() + " - " + cayTrongNhaThapNhat.getChiPhiChamSoc() + " VNĐ" : "Không có cây nào."));
        System.out.println("Cây ngoài trời có chi phí chăm sóc cao nhất: " + (cayNgoaiTroiCaoNhat != null ? cayNgoaiTroiCaoNhat.getTenCay() + " - " + cayNgoaiTroiCaoNhat.getChiPhiChamSoc() + " VNĐ" : "Không có cây nào."));
        System.out.println("Cây ngoài trời có chi phí chăm sóc thấp nhất: " + (cayNgoaiTroiThapNhat != null ? cayNgoaiTroiThapNhat.getTenCay() + " - " + cayNgoaiTroiThapNhat.getChiPhiChamSoc() + " VNĐ" : "Không có cây nào."));
    }
	
}

package Ke_thua_don_QLy_NVien;

import java.util.jar.Attributes.Name;

public class main {
	public static void main(String[] args) {
		OfficeEmployee off = new OfficeEmployee("Nguyễn Văn A", 20 , 22,100);
		System.out.println(off.getName() + " " + off.getAge() + " " + off.Salary());
		System.out.println("--------------");
		TechnicalEmployee te = new TechnicalEmployee("Nguyễn Văn B", 20,160,15.5);
		System.out.println(te.getName() + " " + te.getAge() + "   " + te.Salary());
				
	}
	
}

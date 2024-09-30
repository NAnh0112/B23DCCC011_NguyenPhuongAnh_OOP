package Ke_thua_boi_QLy_NVien;

public class main {
	public static void main(String[] args) {
		OfficeEmployee off = new OfficeEmployee("Nguyễn Văn A");
		off.EmailSender();
		
		TechnicalEmployee te = new TechnicalEmployee("Nguyễn Văn B");
        te.Programmer();
        
        SalesEmployee sal = new SalesEmployee("Nguyễn Văn C");
        sal.Salesperson(); 
	}
}

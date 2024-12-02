package File;

import java.io.PrintWriter;

public class Ghi_DL {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\PAnh\\Java\\PA\\src\\Ke_Thua\\file.txt");
			pw.println("Lưu Diệc Phi đang gây sốt trên Xiaohongshu vì loạt ảnh xuất “thần”, đẹp không khác gì tranh vẽ");
			pw.print("Dữ liệu: ");
			pw.print(3.14);		
			pw.flush();
			pw.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

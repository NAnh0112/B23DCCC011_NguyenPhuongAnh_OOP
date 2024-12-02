package Main2;
import java.util.Scanner;

public class ThuNhapGVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maNgach = scanner.nextLine();
        String hoTen = scanner.nextLine();
        int luongCoBan = scanner.nextInt();
        String chucVu = maNgach.substring(0, 2); //chuyển đổi trích xuất
        int heSoBacLuong = Integer.parseInt(maNgach.substring(2, 4)); //số nguyên
        int phuCap = 0;
        switch (chucVu) {
            case "HT":
                phuCap = 2000000;
                break;
            case "HP":
                phuCap = 900000;
                break;
            case "GV":
                phuCap = 500000;
                break;
            default:
                System.out.println("Mã ngạch không hợp lệ.");
                return;
        }
        int thuNhap = luongCoBan * heSoBacLuong + phuCap;
        System.out.printf("%s %s %d %d %d\n", maNgach, hoTen, heSoBacLuong, phuCap, thuNhap);
    }
}
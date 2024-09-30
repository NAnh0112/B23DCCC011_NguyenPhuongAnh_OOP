package Tai_Xiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi", "VN");
        //NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        
        int luaChon = 1;

        do {
            System.out.println("---------MỜI BẠN LỰA CHỌN-------------");
            System.out.println("Chọn (1) để tiếp tục chơi");
            System.out.println("Chọn (phím bất kỳ) để thoát");
            luaChon = sc.nextInt();

            if (luaChon == 1) {
                System.out.println(" BẮT ĐẦU CHƠI");

                // Đặt cược
                System.out.println(" Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi) + ", bạn muốn cược bao nhiêu?");
                double datCuoc = 0;

                do {
                    System.out.println(" Đặt cược (0 < Số tiền cược <= " + numf.format(taiKhoanNguoiChoi) + "): ");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                // Chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println(" Chọn: (1) <-> Tài hoặc (2) <-> Xỉu");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung xúc xắc
                Random random = new Random();
                int giaTri1 = random.nextInt(6) + 1;
                int giaTri2 = random.nextInt(6) + 1;
                int giaTri3 = random.nextInt(6) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;

                // Tính toán kết quả
                System.out.println("Kết Quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);

                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("Tổng là " + tong + " ==> Nhà cái ăn hết, bạn đã thua!");
                } else if (tong >= 4 && tong <= 10) {  // Xỉu
                    System.out.println("Tổng là " + tong + " ==> Xỉu!");
                    if (luaChonTaiXiu == 2) {
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Bạn đã thắng cược");
                    } else {
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Bạn đã thua cược");
                    }
                } else {  // Tài
                    System.out.println("Tổng là " + tong + " ==> Tài!");
                    if (luaChonTaiXiu == 1) {
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Bạn đã thắng cược");
                    } else {
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Bạn đã thua cược");
                        System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }
                
            }
        } while (luaChon == 1);
    }
}

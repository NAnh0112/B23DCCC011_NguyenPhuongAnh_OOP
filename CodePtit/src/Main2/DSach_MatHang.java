package Main2;

import java.util.*;

class MatHang {
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;
    public MatHang(int stt, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = String.format("MH%03d", stt);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    // Getter for loiNhuan
    public int getLoiNhuan() {
        return this.loiNhuan;
    }

    // Getter for maMatHang
    public String getMaMatHang() {
        return this.maMatHang;
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}

public class DSach_MatHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soMatHang = scanner.nextInt();
        scanner.nextLine(); 
        List<MatHang> danhSachMatHang = new ArrayList<>();
        for (int i = 1; i <= soMatHang; i++) {
            String tenMatHang = scanner.nextLine();
            String donViTinh = scanner.nextLine();
            int giaMua = Integer.parseInt(scanner.nextLine());
            int giaBan = Integer.parseInt(scanner.nextLine()); //chuyển đổi số nguyên
            MatHang mh = new MatHang(i, tenMatHang, donViTinh, giaMua, giaBan);
            danhSachMatHang.add(mh);
        }
        danhSachMatHang.sort((mh1, mh2) -> {
            if (mh2.getLoiNhuan() != mh1.getLoiNhuan()) {
                return mh2.getLoiNhuan() - mh1.getLoiNhuan();
            } else {
                return mh1.getMaMatHang().compareTo(mh2.getMaMatHang());
            }
        });
        for (MatHang mh : danhSachMatHang) {
            System.out.println(mh);
        }
    }
}
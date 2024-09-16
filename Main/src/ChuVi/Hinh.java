package ChuVi;

public class Hinh {
    private int cDai, cRong;

    public Hinh(int cDai, int cRong) {
        if (cDai <= 0 && cRong <= 0) {
            System.out.println("Nhập lại");
        } else {
            this.cDai = cDai;
            this.cRong = cRong;
        }
    }

    public int getcDai() {
        return cDai;
    }

    public void setcDai(int cDai) {
        this.cDai = cDai;
    }

    public int getcRong() {
        return cRong;
    }

    public void setcRong(int cRong) {
        this.cRong = cRong;
    }

    public double tinhDienTich() {
        return this.cDai * this.cRong;
    }

    public double tinhChuVi() {
        return 2 * (this.cDai + this.cRong);
    }
}

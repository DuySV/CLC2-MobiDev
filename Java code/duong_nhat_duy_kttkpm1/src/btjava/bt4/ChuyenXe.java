package btjava.bt4;

public class ChuyenXe {
    String maSochuyen,tenTaixe,soXe;
    int doanhThu;

    public ChuyenXe(String maSochuyen, String tenTaixe, String soXe, int doanhThu) {
        this.maSochuyen = maSochuyen;
        this.tenTaixe = tenTaixe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getmaSoChuyen() {
        return maSochuyen;
    }

    public void setMaSochuyen(String maSochuyen) {
        this.maSochuyen = maSochuyen;
    }

    public String getTenTaixe() {
        return tenTaixe;
    }

    public void setTenTaixe(String tenTaixe) {
        this.tenTaixe = tenTaixe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public int getDoanhThu(int doanhThu) {
        return doanhThu;
    }
    public void getDoanhThu() {
        this.doanhThu=doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "maSochuyen='" + maSochuyen + '\'' +
                ", tenTaixe='" + tenTaixe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}

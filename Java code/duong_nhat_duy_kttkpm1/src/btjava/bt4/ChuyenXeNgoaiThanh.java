package btjava.bt4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen,soNgaydi ;

    public ChuyenXeNgoaiThanh(String maSochuyen, String tenTaixe, String soXe, int doanhThu, String noiDen, String soNgaydi) {
        super(maSochuyen, tenTaixe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgaydi = soNgaydi;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getSoNgaydi() {
        return soNgaydi;
    }

    public void setSoNgaydi(String soNgaydi) {
        this.soNgaydi = soNgaydi;
    }
}

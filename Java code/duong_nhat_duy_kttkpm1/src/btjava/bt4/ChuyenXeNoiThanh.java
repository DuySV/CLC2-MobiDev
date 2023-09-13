package btjava.bt4;

public class ChuyenXeNoiThanh extends ChuyenXe {
String sotuyen,SoKM;

    public ChuyenXeNoiThanh(String maSochuyen, String tenTaixe, String soXe, int doanhThu, String sotuyen, String soKM) {
        super(maSochuyen, tenTaixe, soXe, doanhThu);
        this.sotuyen = sotuyen;
        SoKM = soKM;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public String getSoKM() {
        return SoKM;
    }

    public void setSoKM(String soKM) {
        SoKM = soKM;
    }
}

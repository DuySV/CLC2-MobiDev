package btjava.bt3;

public class HocSinh extends CaNhan{
    String lop,nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sdt, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
}

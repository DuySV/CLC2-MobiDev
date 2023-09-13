package btjava.bt1;

public class NhanVien {
    String ten,diaChi;
    int tongSoGiolam,tuoi;
    double tienLuong;

    public NhanVien(String ten, String diaChi, int tongSoGiolam, int tuoi, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tongSoGiolam = tongSoGiolam;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
    }

    public String getThongTin() {
        return "Ho Ten:" + this.ten + "\n" +
                "Tuoi:" + this.tuoi + "\n" +
                "Diachi:" + this.diaChi + "\n" +
                "Tong so gio lam:" + this.tongSoGiolam + "\n" +
                "tien luong:" + this.tienLuong + "\n";
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public double tinhThuong(){
       if (tongSoGiolam<100)
           return 0;
       if(tongSoGiolam<200)
           return tienLuong*0.1;
       return  tienLuong*0.2;
     }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTongSoGiolam() {
        return tongSoGiolam;
    }

    public void setTongSoGiolam(int tongSoGiolam) {
        this.tongSoGiolam = tongSoGiolam;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
}

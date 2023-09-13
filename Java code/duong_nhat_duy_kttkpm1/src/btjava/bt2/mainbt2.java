package btjava.bt2;

import btjava.bt1.NhanVien;

public class mainbt2 {
    public static void main(String[] args) {
        IQuanLy quanLyNV=new QuanLyNhanVien();
        quanLyNV.themNV(new NhanVien("minh","nhatrang",100,30,1300000));
        quanLyNV.themNV(new NhanVien("man","nhatrang",100,30,1300000));
        quanLyNV.themNV(new NhanVien("dat","nhatrang",100,30,1300000));
        quanLyNV.themNV(new NhanVien("thu","nhatrang",100,30,1300000));
        quanLyNV.themNV(new NhanVien("phuc","nhatrang",100,30,1300000));
        quanLyNV.inDS();
    }
}

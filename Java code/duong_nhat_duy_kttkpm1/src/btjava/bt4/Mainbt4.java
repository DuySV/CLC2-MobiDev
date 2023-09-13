package btjava.bt4;

public class Mainbt4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanLyChuyenXe= new QuanLyChuyenXe();
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("666AAA","duy","12462",10000,"1A","50km"));
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("777AAA","duy","12462",10000,"1A","50km"));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("778AAA","duy","12462",10000,"nhatrang","30/5"));
        quanLyChuyenXe.inDS();
        quanLyChuyenXe.doanhThuXeNgoaiThanh();

    }
}

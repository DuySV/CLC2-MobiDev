package btjava.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
List<ChuyenXe> dsCX= new ArrayList<>();
public void them(ChuyenXe cx){
    dsCX.add(cx);
}

    public void inDS(){
    for (ChuyenXe cx : dsCX)
        System.out.println(cx.toString());
        }
    public int doanhThuXeNoiThanh()
    {
        int tong=0;
        for(ChuyenXe cx:dsCX){
            if(cx instanceof ChuyenXeNoiThanh)
                tong+= cx.doanhThu;
        }
        return tong;
    }
    public int doanhThuXeNgoaiThanh()
    {
        int tong=0;
        for(ChuyenXe cx:dsCX){
            if(cx instanceof ChuyenXeNgoaiThanh)
                tong+= cx.doanhThu;
        }
        return tong;
    }


}




package bt_java.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> list = new ArrayList<>();
    public void them(ChuyenXe c){
        //Kiểm tra nếu có chuyến xe đã có trong danh sách thì dừng
        for (ChuyenXe cx: list){
            if (cx.getMaSoChuyen().equals(c.getMaSoChuyen()))
                return;
            //Thêm chuyến xe nếu chưa có trong danh sách
        }
        list.add(c);
    }
    public float doanhThuXeNgoaiThanh() {
        float dt = 0;
        for (ChuyenXe c : list) {
            if (c instanceof ChuyenXeNgoaiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }
    public float doanhThuXeNoiThanh() {
        float dt = 0;
        for (ChuyenXe c : list) {
            if (c instanceof ChuyenXeNoiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }
    public float doanhThuCua2Xe(){
        float dt = 0;
        for (ChuyenXe c : list) {
                dt += c.getDoanhThu();
        }
        return dt;
    }
    public void inDS(){
        for (ChuyenXe c : list) {
            System.out.println(c.toString());
        }
    }
}

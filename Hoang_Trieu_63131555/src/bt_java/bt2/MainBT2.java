package bt_java.bt2;

import bt_java.bt1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));
        quanLy.them(new NhanVien("Hoàng Lâm","Cam Lâm",20,200,20));

        quanLy.inDS();
    }
}

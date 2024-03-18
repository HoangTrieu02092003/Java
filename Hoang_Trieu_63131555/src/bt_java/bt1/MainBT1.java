package bt_java.bt1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Hoàng Lâm","Cam Lâm",20,100,200000);
        NhanVien nhanVien2 = new NhanVien("Duy Thân","Cam Lâm",20,99,200000);
        NhanVien nhanVien3 = new NhanVien();
        System.out.println(nhanVien1.getThongTin());
        System.out.println("Tiền thưởng:");
        System.out.println(nhanVien1.tinhLuong());
        System.out.println(nhanVien2.getThongTin());
        System.out.println("Tiền thưởng:");
        System.out.println(nhanVien2.tinhLuong());
        System.out.println(nhanVien3.getThongTin());
        System.out.println("Tiền thưởng:");
        System.out.println(nhanVien3.tinhLuong());
    }
}

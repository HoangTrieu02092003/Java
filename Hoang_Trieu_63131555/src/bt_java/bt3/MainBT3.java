package bt_java.bt3;

public class MainBT3 {
    public static void main(String[] args) {
        SinhVienBiz sinhVienBiz = new SinhVienBiz("Võ Duy Thân","Marketing",7,6);
        sinhVienBiz.xuat();
        SinhVienIT sinhVienIT = new SinhVienIT("Tôn Thất Hoàng Triều","CNTT",9,9,8);
        sinhVienIT.xuat();
        SinhVienPoly sinhVienPoly = new SinhVienPoly("Đặng Hoàng Lâm", "CNTT") {
            @Override
            public double getDiem() {
                return 0;
            }
        };
        sinhVienPoly.xuat();
    }
}

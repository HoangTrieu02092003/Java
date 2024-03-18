package bt_java.bt4;

/*
Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
 */

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen, soKM;

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, int soTuyen, int soKM) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        String st = super.toString();
        st = st + "Số tuyến:" + soTuyen + "\n" +
            "Số Km đi được:"+ soKM + "\n";
        return st;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}

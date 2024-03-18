package builder_pattern.A1;

import java.util.Date;

public class HoaDonHeader {
    private String maHoaDon;
    private Date ngayBan;
    private String tenKhachHang;

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(maHoaDon).append("\t")
                .append(" Ngày bán ").append(ngayBan.toInstant()).append("\t")
                .append(" Tên khách hàng ").append(tenKhachHang).append("\t");
        //return "Mã hóa đơn: " + maHoaDon + ", ngày bán: " + ngayBan + ", tên khách hàng: " + tenKhachHang;
        return builder.toString();
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
}

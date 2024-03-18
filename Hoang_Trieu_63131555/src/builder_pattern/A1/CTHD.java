package builder_pattern.A1;

public class CTHD {
    private String sanPham;
    private int soLuong;
    private int donGia;
    private double chietKhau;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(sanPham).append("\t")
                .append("Số lượng ").append(soLuong).append("\t")
                .append("Đơn giá ").append(donGia).append("\t")
                .append("Chiếu khấu ").append(chietKhau).append("\t");
        //return "Sản phầm: " + sanPham + ", số lượng: " + soLuong + ", đơn giá: " + donGia + ", chiết khấu: " + chietKhau;
        return builder.toString();
    }

    public CTHD(String sanPham, int soLuong, int donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }
}

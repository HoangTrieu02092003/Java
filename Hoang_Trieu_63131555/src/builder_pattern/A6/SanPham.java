package builder_pattern.A6;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double donGia;

    public SanPham(int maSanPham, String tenSanPham, int soLuong, double donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Sản phẩm" +
                " Mã sản phầm: " + maSanPham +
                ", Tên sản phẩm: " + tenSanPham  +
                ", Số lượng: " + soLuong +
                ", Đơn giá: " + donGia ;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
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

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}

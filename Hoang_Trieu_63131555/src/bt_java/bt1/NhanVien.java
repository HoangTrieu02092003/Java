package bt_java.bt1;

public class NhanVien {
    String ten, diaChi;
    int tuoi, tongSoGioLam;
    double tienLuong;

    // Constructor không tham số
    public NhanVien() {
        // Set values to default
        this.ten = "Tôn Thất Hoàng Triều";
        this.diaChi = "Cam Lâm, Khánh Hòa";
        this.tuoi = 20;
        this.tongSoGioLam = 200;
        this.tienLuong = 200000;
    }

    // Constructor đầy đủ tham số
    public NhanVien(String ten, String diaChi, int tuoi, int tongSoGioLam, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.tienLuong = tienLuong;
    }

    @Override
    public String toString() {
        return "Nhân Viên" +
                "Tên:" + ten +
                ", Địa chỉ:" + diaChi +
                ", Tuổi:" + tuoi +
                ", Tổng số giờ làm:" + tongSoGioLam +
                ", Tiền Lương:" + tienLuong
                ;
    }
    public String getThongTin() {
        return "Nhân Viên" +
                "Tên:" + ten +
                ", Địa chỉ:" + diaChi +
                ", Tuổi:" + tuoi +
                ", Tổng số giờ làm:" + tongSoGioLam +
                ", Tiền Lương:" + tienLuong
                ;
    }
    double tinhLuong(){
        if(tongSoGioLam>=200)
            return tienLuong*0.2;
        if(tongSoGioLam>=100)
            return tienLuong*0.1;
        return 0;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

}

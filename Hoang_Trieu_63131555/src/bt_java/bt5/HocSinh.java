package bt_java.bt5;

public class HocSinh extends CaNhan{
    private String lop, nangKhieu;

    public HocSinh() {
        super();
    }

    public HocSinh(String lop, String nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public HocSinh(String hoTen, String diaChi, String sdt, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String hienThiTT() {
        String info;
        info = "Ho va ten: " + hoTen + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi
                + ", So dien thoai: " + sdt + ", Lop: " + lop + ", Nang khieu: " + nangKhieu ;

        System.out.println(info);
        return info;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
}

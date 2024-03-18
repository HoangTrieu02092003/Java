package bt_java.bt5;

public abstract class CaNhan {
    protected String hoTen, diaChi, sdt;
    protected int tuoi;

    public CaNhan(){
    }

    public CaNhan(String hoTen, String diaChi, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }

    public abstract String hienThiTT();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}

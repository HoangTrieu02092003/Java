package structural.composite.B4;

public abstract class KeHoachHocTap {
    String ten;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void add(KeHoachHocTap k);
    public abstract void remove(KeHoachHocTap k);
    public abstract int soTC();
    public abstract int hocPhi();
    public abstract String hienThiThongTin();
}

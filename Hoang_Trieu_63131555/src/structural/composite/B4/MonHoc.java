package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class MonHoc extends KeHoachHocTap{
    int soTinChi;
    int hocPhiTinChi;

    public MonHoc(String ten, int soTinChi, int hocPhiTinChi) {
        super(ten);
        this.soTinChi = soTinChi;
        this.hocPhiTinChi = hocPhiTinChi;
    }

    @Override
    public void add(KeHoachHocTap k) {
    }

    @Override
    public void remove(KeHoachHocTap k) {
    }

    @Override
    public int soTC() {
        return soTinChi;
    }

    @Override
    public int hocPhi() {
        return soTinChi * hocPhiTinChi;
    }

    @Override
    public String hienThiThongTin() {
        return this.ten + "\t" + "So TC: " + soTC() + "\t" + "Hoc phi: " + hocPhi();
    }
}

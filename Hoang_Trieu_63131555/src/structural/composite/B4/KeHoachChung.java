package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{

    List<KeHoachHocTap> children = new ArrayList<>();
    public KeHoachChung(String ten) {
        super(ten);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(KeHoachHocTap k) {
        children.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        children.remove(k);
    }

    @Override
    public int soTC() {
        int t = 0;
        for (KeHoachHocTap child : children) {
            t += child.soTC();
        }
        return t;
    }

    @Override
    public int hocPhi() {
        int t = 0;
        for (KeHoachHocTap child : children) {
            t += child.hocPhi()*child.soTC();
        }
        return t;
    }

    @Override
    public String hienThiThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten).append("\t").append(" TC: ").append(soTC()).append("\t").append("Hoc phi: ").append(hocPhi());
        for (KeHoachHocTap child : children) {
//            child.p = this.p + "\t";
//            builder.append("\n").append(k.p).append(child.hienThiThongTin());
//            child.p = "";
            builder.append("\n\t").append(child.hienThiThongTin().replaceAll("\n","\n\t"));
        }
        return builder.toString();
    }
}

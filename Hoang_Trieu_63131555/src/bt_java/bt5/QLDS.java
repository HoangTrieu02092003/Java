package bt_java.bt5;

import java.util.ArrayList;

public class QLDS implements IQLDS{
    private ArrayList<CaNhan> DanhSachCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        DanhSachCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        if (DanhSachCaNhan.removeIf(p -> p.hoTen == ten)) {
            return 1;
        }
        else
            return 0;
    }

    @Override
    public void inDS() {
        DanhSachCaNhan.forEach(p -> p.hienThiTT());
    }
}

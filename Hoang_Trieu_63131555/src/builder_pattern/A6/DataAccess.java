package builder_pattern.A6;

import singleton.vidu.MySingleton;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    private List<SanPham> danhSachSanPham = new ArrayList<>();
    List<SanPham> list = new ArrayList<>();
    public static DataAccess getInstance() {
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }
    public void add(SanPham s){
        danhSachSanPham.add(s);
    }
    public void delete(int maSanPham) {
        danhSachSanPham.removeIf(sp -> sp.getMaSanPham() == maSanPham);
    }

    public void capNhatSanPham(SanPham sanPham) {
        for (SanPham sp : danhSachSanPham) {
            if (sp.getMaSanPham() == sanPham.getMaSanPham()) {
                sp.setTenSanPham(sanPham.getTenSanPham());
                sp.setSoLuong(sanPham.getSoLuong());
                sp.setDonGia(sanPham.getDonGia());
                break;
            }
        }
    }
    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }
}

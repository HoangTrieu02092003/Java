package builder_pattern.A6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> instance = new Hashtable<>();
    private List<SanPham> danhSachSanPham = new ArrayList<>();
    List<SanPham> list = new ArrayList<>();
    public static DataAccessUpgrade getInstance(String tag) {
        if(instance.get(tag) == null) {
            DataAccessUpgrade d = new DataAccessUpgrade();
            instance.put(tag,d);
        }
        return instance.get(tag);
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

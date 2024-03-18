package builder_pattern.A6;

import java.util.ArrayList;
import java.util.List;

public class UI1 {
    private List<SanPham> danhSachSanPham = new ArrayList<>();
    public void add(SanPham s){
        var d = DataAccess.getInstance();
        d.add(s);
    }
    public void add(SanPham s, String tag){
        //Lấy một đối tượng DataaccessUpgrade
        //Gọi phương thức add trên đối tượng vừa lấy
        var d = DataAccessUpgrade.getInstance(tag);
        d.add(s);
    }
    public List<SanPham> get() {
        return danhSachSanPham;
    }
}

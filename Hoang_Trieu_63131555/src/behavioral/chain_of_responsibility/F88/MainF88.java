package behavioral.chain_of_responsibility.F88;

public class MainF88 {
    public static void main(String[] args) {
        ChoVayF88 baoVe = new NhanVien("Lâm","Bảo vệ",1_000_000);
        ChoVayF88 tapVu = new NhanVien("Thân","Tạp vụ",5_000_000);
        ChoVayF88 nvVP = new NhanVien("Việt","Nhân viên",10_000_000);
        ChoVayF88 truongPhong = new NhanVien("Toàn","Trưởng phòng",20_000_000);
        ChoVayF88 giamDoc = new NhanVien("Thiên","Giám đốc",50_000_000);
        ChoVayF88 chuTich = new ChuTich("Triều","Chủ tịch",100_000_000);
        baoVe.capCaoHon(tapVu)
                .capCaoHon(nvVP)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc)
                .capCaoHon(chuTich);
        System.out.println(baoVe.xuLyVay(45_000_000));
        System.out.println(baoVe.xuLyVay(15_000_000));
        System.out.println(baoVe.xuLyVay(80_000_000));
        System.out.println(baoVe.xuLyVay(100_000_000));
    }
}

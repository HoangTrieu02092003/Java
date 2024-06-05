package observer.chainofresponsibility.CB4;

import java.util.ArrayList;
import java.util.List;

public class MainCB4 {
    public static void main(String[] args) {
        GiaiThuong giaiDB = new GiaiThongThuong("giải đặc biệt", new ArrayList<>(List.of("615582")));
        GiaiThuong giai1 = new GiaiThongThuong("giải 1", new ArrayList<>(List.of("08666")));
        GiaiThuong giai2 = new GiaiThongThuong("giải 2", new ArrayList<>(List.of("56741")));
        GiaiThuong giai3 = new GiaiThongThuong("giải 3", new ArrayList<>(List.of("53015", "79895")));
        GiaiThuong giai4 = new GiaiThongThuong("giải 4", new ArrayList<>(List.of("68309", "42185", "72739", "39051", "63788", "42453", "49378")));
        GiaiThuong giai5 = new GiaiThongThuong("giải 5", new ArrayList<>(List.of("1565")));
        GiaiThuong giai6 = new GiaiThongThuong("giải 6", new ArrayList<>(List.of("6060", "7485", "0399")));
        GiaiThuong giai7 = new GiaiThongThuong("giải 7", new ArrayList<>(List.of("360")));
        GiaiThuong giai8 = new GiaiThapNhat("giải 8", new ArrayList<>(List.of("68")));
        GiaiThuong giaiKK = new GiaiKK("Giải khuyến khích", new ArrayList<>(List.of("615582")));

        giaiDB.giaiKeTiep(giai1)
                .giaiKeTiep(giaiKK)
                .giaiKeTiep(giai2)
                .giaiKeTiep(giai3)
                .giaiKeTiep(giai4)
                .giaiKeTiep(giai5)
                .giaiKeTiep(giai6)
                .giaiKeTiep(giai7)
                .giaiKeTiep(giai8);

        giaiDB.doVeSo("615580");
    }
}

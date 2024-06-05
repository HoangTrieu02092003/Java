package observer.chainofresponsibility.CB4;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong{
    GiaiThuong giaiKeTiep;
    public GiaiThongThuong(String tenGiai, List<String> boSo) {
        super(tenGiai, boSo);
    }

    @Override
    public void doVeSo(String soVe) {
        for (String giai : boSo){
            if (soVe.endsWith(giai)){
                System.out.println("\nBạn trúng " + tenGiai +"!");
                return;
            }
        }
        giaiKeTiep.doVeSo(soVe);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong giaiThuong) {
        giaiKeTiep = giaiThuong;
        return this.giaiKeTiep;
    }
}

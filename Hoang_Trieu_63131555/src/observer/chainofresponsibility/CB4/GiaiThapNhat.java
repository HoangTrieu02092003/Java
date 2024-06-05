package observer.chainofresponsibility.CB4;

import java.util.List;

public class GiaiThapNhat extends GiaiThuong{
    public GiaiThapNhat(String tenGiai, List<String> boSo) {
        super(tenGiai, boSo);
    }

    @Override
    public void doVeSo(String soVe) {
        for (String giai8 : boSo){
            if (soVe.endsWith(giai8)){
                System.out.println("\nBạn trúng giải 8!");
                return;
            }
            else System.out.println("\nChúc bạn may mắn lần sau!");
        }
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong giaiThuong) {
        return null;
    }
}

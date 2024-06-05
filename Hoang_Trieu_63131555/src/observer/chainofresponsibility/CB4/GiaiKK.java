package observer.chainofresponsibility.CB4;

import java.util.List;

public class GiaiKK extends GiaiThuong{
    GiaiThuong giaiKeTiep;
    public GiaiKK(String tenGiai, List<String> boSo) {
        super(tenGiai, boSo);
    }

    @Override
    public void doVeSo(String soVe) {
        String giaiThuong = boSo.getFirst();
        int count = 0;

        String sub = soVe.substring(soVe.length() - giaiThuong.length());

        for (int i=0; i<sub.length(); i++){
            if (sub.charAt(i) == giaiThuong.charAt(i))
                count ++;
        }

        if (count == giaiThuong.length() - 1)
            System.out.println("\nBạn trúng giải khuyến khích!");
        giaiKeTiep.doVeSo(soVe);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong giaiThuong) {
        giaiKeTiep = giaiThuong;
        return this.giaiKeTiep;
    }
}

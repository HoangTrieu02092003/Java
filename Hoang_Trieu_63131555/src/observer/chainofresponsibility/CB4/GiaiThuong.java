package observer.chainofresponsibility.CB4;

import java.util.List;

public abstract class GiaiThuong {
    String tenGiai;
    List<String> boSo;

    public GiaiThuong(String tenBac, List<String> boSo) {
        this.tenGiai = tenBac;
        this.boSo = boSo;
    }

    public abstract void doVeSo(String soVe);
    public abstract GiaiThuong giaiKeTiep(GiaiThuong giaiThuong);

}

package observer.chainofresponsibility.CB5;

public abstract class XepLoai {
    String hocLuc;
    int minDiem;

    public XepLoai(String hocLuc, int minDiem) {
        this.hocLuc = hocLuc;
        this.minDiem = minDiem;
    }

    public abstract void xetHocLuc(int diem);
    public abstract XepLoai xepLoaiKeTiep(XepLoai xepLoai);
}

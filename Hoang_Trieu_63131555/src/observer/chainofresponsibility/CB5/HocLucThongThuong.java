package observer.chainofresponsibility.CB5;

public class HocLucThongThuong extends XepLoai{
    XepLoai xepLoaiKeTiep;

    public HocLucThongThuong(String hocLuc, int minDiem) {
        super(hocLuc, minDiem);
    }

    @Override
    public void xetHocLuc(int diem) {
        if (diem >= minDiem){
           // hocLuc = "Thường";
            System.out.println("Học lực: " + hocLuc);
            return;
        }
        xepLoaiKeTiep.xetHocLuc(diem);
    }

    @Override
    public XepLoai xepLoaiKeTiep(XepLoai xepLoai) {
        xepLoaiKeTiep = xepLoai;
        return this.xepLoaiKeTiep;
    }
}

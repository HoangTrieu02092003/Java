package observer.chainofresponsibility.CB5;

public class HocLucThapNhat extends XepLoai{


    public HocLucThapNhat(String hocLuc, int minDiem) {
        super(hocLuc, minDiem);
    }

    @Override
    public void xetHocLuc(int diem) {
//        if (diem >= minDiem && diem <= maxDiem){
//            // hocLuc = "Thường";
//            System.out.println("Học lực: Yếu");
//            return;
//        }
        System.out.println("Học lực: Yếu");
    }

    @Override
    public XepLoai xepLoaiKeTiep(XepLoai xepLoai) {
        return null;
    }
}

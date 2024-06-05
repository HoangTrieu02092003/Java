package observer.chainofresponsibility.CB5;

public class MainCB5 {
    public static void main(String[] args) {
        XepLoai xepLoaiXuatSac = new HocLucThongThuong("Xuất sắc", 9);
        XepLoai xepLoaiGioi = new HocLucThongThuong("Giỏi", 8);
        XepLoai xepLoaiKha = new HocLucThongThuong("Khá", 7);
        XepLoai xepLoaiTB = new HocLucThongThuong("Trung bình", 5);
        XepLoai xepLoaiYeu = new HocLucThapNhat("Yếu", 0);

        xepLoaiXuatSac.xepLoaiKeTiep(xepLoaiGioi)
                .xepLoaiKeTiep(xepLoaiKha)
                .xepLoaiKeTiep(xepLoaiTB)
                .xepLoaiKeTiep(xepLoaiYeu);

        xepLoaiXuatSac.xetHocLuc(5);
    }
}

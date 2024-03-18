package bt_java.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("001","Đức Thắng","79A-555",1000,1,10));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("002","Duy Thân","79A-111",2000,"Nha Trang",4));quanLyChuyenXe.them(new ChuyenXeNoiThanh("003","Đức Thắng","79A-555",1000,1,10));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("004","Duy Thân","79A-111",2000,"Nha Trang",4));quanLyChuyenXe.them(new ChuyenXeNoiThanh("005","Đức Thắng","79A-555",1000,1,10));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("006","Duy Thân","79A-111",2000,"Nha Trang",4));
        quanLyChuyenXe.inDS();
        System.out.println("Doanh thu xe nội thành:" + quanLyChuyenXe.doanhThuXeNoiThanh());
        System.out.println("Doanh thu xe ngoại thành:" + quanLyChuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("Doanh thu cả 2 xe:" + quanLyChuyenXe.doanhThuCua2Xe());

    }
}

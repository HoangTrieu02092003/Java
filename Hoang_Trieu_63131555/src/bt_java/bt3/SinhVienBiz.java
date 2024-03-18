package bt_java.bt3;

public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {

        return Math.round((2*diemMarketing+diemSales)/3*100)/100.0;
    }
    public void xuat(){
        System.out.println("Họ tên: " + hoTen + " Ngành: " + nganh  + "\n" +
                "Điểm Marketing: " + diemMarketing + "\n" +
                "Điểm Sale: " + diemSales + "\n" +
                "Học lực: " + getHocLuc());
    }
}

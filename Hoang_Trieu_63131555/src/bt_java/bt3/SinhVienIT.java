package bt_java.bt3;

public class SinhVienIT extends SinhVienPoly{
    double diemJava, diemCss, diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return Math.round((2*diemJava+diemHtml+diemCss)/4 *100)/100.0;
    }

    public void xuat(){
        System.out.println("Họ tên: " + hoTen + " Ngành: " + nganh + "\n" +
                "Điểm Java: " + diemJava + "\n" +
                "Điểm Css: " + diemCss + "\n" +
                "Điểm Html: " + diemHtml + "\n" +
                "Học lực: " + getHocLuc());
    }
}

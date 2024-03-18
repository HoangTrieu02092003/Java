package bt_java.bt3;

public abstract class SinhVienPoly {
    String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc(){
        if (getDiem()<5)
            return "Yếu";
        else if (getDiem()<6.5)
            return "Trung bình";
        else if (getDiem()<7.5)
            return "Khá";
        else if (getDiem()<9)
            return "Giỏi";
        return "Xuất sắc";
    }

    public void xuat(){
        System.out.println("Họ tên: " + hoTen + " Ngành: " + nganh);
    }
}

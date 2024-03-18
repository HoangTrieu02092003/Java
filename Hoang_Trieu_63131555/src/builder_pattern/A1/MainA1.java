package builder_pattern.A1;
import java.util.Date;

public class MainA1 {
    public static void main(String[] args) {
        HoaDonHeader hoaDonHeader = new HoaDonHeader
                ("HD001", new Date("1/1/2022"),"Tôn Thất Hoàng Triều");
        CTHD CTHD1 = new CTHD("Keyboard",2,1000000,0.2);
        CTHD CTHD2 = new CTHD("Headphone",2,2500000,0.3);
        CTHD CTHD3 = new CTHD("Laptop",1,15000000,0.5);
        CTHD CTHD4 = new CTHD("USB",7,999000,0.5);

        HoaDon hoaDon = new HoaDon.Builder()
                .getHoaDonHeader(hoaDonHeader)
                .getCTHD(CTHD1)
                .getCTHD(CTHD2)
                .getCTHD(CTHD3)
                .getCTHD(CTHD4)
                .build();
        System.out.println(hoaDon.toString());
    }
}

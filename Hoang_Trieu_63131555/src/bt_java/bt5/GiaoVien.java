package bt_java.bt5;

public class GiaoVien extends CaNhan{
    private String monDay, toBoMon;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        String info;
        info = "Ho va ten: " + hoTen + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi
                + ", So dien thoai : " + sdt + ", Mon giang day: " + monDay + ", To bo mon: " + toBoMon;
        System.out.println(info);
        return info;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
}

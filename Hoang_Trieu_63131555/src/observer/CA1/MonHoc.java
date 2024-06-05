package observer.CA1;

public class MonHoc {
    String tenMH, maMH;
    int soTC;

    public MonHoc(String tenMH, String maMH, int soTC) {
        this.tenMH = tenMH;
        this.maMH = maMH;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "tenMH='" + tenMH + '\'' +
                ", maMH='" + maMH + '\'' +
                ", soTC=" + soTC +
                '}';
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
}

package structural.decorater.B1;

public class BieuThucDonGian extends BieuThuc {
    float toanHang;


    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
}

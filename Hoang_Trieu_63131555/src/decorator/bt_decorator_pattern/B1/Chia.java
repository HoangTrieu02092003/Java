package decorator.bt_decorator_pattern.B1;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ")" + " / " + toanHang;
    }
}

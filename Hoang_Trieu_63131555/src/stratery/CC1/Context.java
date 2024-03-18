package stratery.CC1;

public class Context {
    //Sử dụng thành phần tùy biến thông qua một đối tượng đại diện
    public Tinh tinh;

    //Setter được sử dụng để gán một đối tượng cụ thể cho biến đại diện khi sử dụng
    public Context setTinh(Tinh tinh) {
        this.tinh = tinh;
        return this;
    }

    public float tinh(float a,float b){
        return tinh.tinh(a,b);
    }
}

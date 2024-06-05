package structural.decorater.B1;

public class MainB1 {
    public static void main(String[] args) {
        BieuThuc b =new BieuThucDonGian(6);
        b = new Cong(b,9);
        b = new Nhan(b,8);
        b = new Cong(b,5);
        System.out.println(b.bieuThuc() + " = " + b.giaTri());

        BieuThuc c =new BieuThucDonGian(8);
        c = new Cong(c,6);
        c = new Chia(c,2);
        c = new Nhan(c,5);
        System.out.println(c.bieuThuc() + " = " + c.giaTri());

        BieuThuc d =new GiaTriTuyetDoi(c);
        System.out.println(d.bieuThuc() + " = " + d.giaTri());
    }
}

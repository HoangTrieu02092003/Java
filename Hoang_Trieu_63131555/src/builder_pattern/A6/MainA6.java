package builder_pattern.A6;

public class MainA6 {
    public static void main(String[] args) {
        UI1 ui1 = new UI1();
        UI1 ui12 = new UI1();
        ui1.add(new SanPham(1, "Laptop", 3, 10000000));
        ui12.add(new SanPham(2, "Tivi", 3, 20000000),"TV");
        System.out.println(ui1.toString());
        System.out.println(ui12.toString());
    }
}

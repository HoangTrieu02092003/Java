package builder_pattern.A5;

public class MainA5 {
    public static void main(String[] args) {
        Sach sach = new Sach.SachBuilder()
                .setTieuDe("Cấu trúc dữ liệu và giải thuật")
                .setTacGia("Nguyễn Khắc Cường")
                .setSoTrang(500)
                .addChuong(new Chuong("Giới thiệu"))
                .addChuong(new Chuong("Cấu trúc dữ liệu"))
                .addChuong(new Chuong("Giải thuật"))
                .build();

        System.out.println(sach);
    }
}

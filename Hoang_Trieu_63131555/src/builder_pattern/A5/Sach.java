package builder_pattern.A5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    String tuaDe, tenTacGia, tieuDe;
    int soTrang;
    List<Chuong> danhSachChuong;

    private Sach(SachBuilder builder) {
        this.tieuDe = builder.tieuDe;
        this.soTrang = builder.soTrang;
        this.tenTacGia = builder.tacGia;
        this.danhSachChuong = builder.danhSachChuong;
    }

    public static class SachBuilder{
        private String tieuDe;
        private int soTrang;
        private String tacGia;
        private List<Chuong> danhSachChuong = new ArrayList<>();

        public SachBuilder setTieuDe(String tieuDe) {
            this.tieuDe = tieuDe;
            return this;
        }

        public SachBuilder setSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public SachBuilder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public SachBuilder addChuong(Chuong chuong) {
            this.danhSachChuong.add(chuong);
            return this;
        }

        public Sach build() {
            return new Sach(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(" Tên sách: " + tieuDe + "**\n");
        b.append("- Tác giả: " + tenTacGia + "\n");
        b.append("- Số trang: " + soTrang + "\n");
        b.append("- Danh sách chương:\n");
        int i = 1;
        for (Chuong chuong : danhSachChuong) {
            b.append("Chương ").append(i++).append(". ").append(chuong.getTenChuong()).append("\n");
        }
        return b.toString();
    }
}

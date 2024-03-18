package stratery.CC2;

public class MainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("Triều","02/09/2003",8));
        qlsv.them(new SinhVien("Thân","02/10/2003",7));
        qlsv.them(new SinhVien("Lâm","22/05/2003",6));
        qlsv.them(new SinhVien("Tài","29/09/2003",6));

        qlsv.inDS();
        System.out.println("Sắp xếp theo điểm");
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        qlsv.inDS();
        System.out.println("Sắp xếp theo tên");
        qlsv.setSoSanh(new SoSanhTheoTen()).sapXep();
        qlsv.inDS();

    }
}

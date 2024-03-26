package structural.composite.B4;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachHocTap keHoachHocTap = new KeHoachChung("nam hoc 2021-2022");
        KeHoachChung Ky1 = new KeHoachChung("Ky 1");
        KeHoachChung Ky2 = new KeHoachChung("Ky 2");
        Ky1.add(new MonHoc("Java", 4, 100));
        Ky1.add(new MonHoc("C++", 3, 150));
        Ky2.add(new MonHoc("C#", 3, 150));
        Ky2.add(new MonHoc("Python", 3, 150));
        keHoachHocTap.add(Ky1);
        keHoachHocTap.add(Ky2);
        System.out.println(keHoachHocTap.hienThiThongTin());
    }
}

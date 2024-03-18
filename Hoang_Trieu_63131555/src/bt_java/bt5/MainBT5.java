package bt_java.bt5;

import java.util.Scanner;

public class MainBT5 {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        Scanner input = new Scanner(System.in);
        // tao them hoc sinh bang input user
        HocSinh hs1 = new HocSinh();
        System.out.println("nhap thong tin hoc sinh: ");
        System.out.print("ten hoc sinh: ");
        hs1.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        hs1.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        hs1.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        hs1.setSdt(input.nextLine());
        System.out.print("lop: ");
        hs1.setLop(input.nextLine());
        System.out.print("nang khieu: ");
        hs1.setNangKhieu(input.nextLine());
        lopHoc.themHocSinh(hs1);

        GiaoVien gv1 = new GiaoVien();
        System.out.println("\nnhap thong tin giao vien giang day: ");
        System.out.print("ten giao vien giang day: ");
        gv1.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        gv1.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        gv1.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        gv1.setSdt(input.nextLine());
        System.out.print("mon day: ");
        gv1.setMonDay(input.nextLine());
        System.out.print("to bo mon: ");
        gv1.setToBoMon(input.nextLine());
        lopHoc.themGiaoVien(gv1);


        // in danh sach hos sinh trong lop
        lopHoc.inDSHS();
        // in danh sach giao vien giang day
        lopHoc.inDSGVGD();
    }
}

package bt_java.bt5;

public class LopHoc {
    IQLDS QLDSGiaoVien = new QLDS();
    IQLDS QLDSHocSinh = new QLDS();

    public LopHoc() {
    }

    public int themHocSinh(HocSinh hs)
    {
        if (QLDSHocSinh.them(hs) == 1) {
            return 1;
        }
        else
            return 0;
    }

    public int themGiaoVien(GiaoVien gv)
    {
        if (QLDSGiaoVien.them(gv) == 1) {
            return 1;
        }
        else
            return 0;

    }

    public int inDSHS() {
        System.out.println("Thong tin hoc sinh vua nhap la :");
        QLDSHocSinh.inDS();
        return 1;
    }
    // in danh sach giao vien giang day
    public int inDSGVGD() {
        System.out.println("Thong tin giao vien giang day vua nhap la :");
        QLDSGiaoVien.inDS();
        return 1;
    }
}

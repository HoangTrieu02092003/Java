package behavioral.chain_of_responsibility.F88;

public abstract class ChoVayF88 {
    String ten,chucVu;
    int hanMucXuLyVay;

    public ChoVayF88(String ten, String chucVu, int hanMucXuLyVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucXuLyVay = hanMucXuLyVay;
    }

    public abstract ChoVayF88 capCaoHon(ChoVayF88 capCao);
    public abstract String xuLyVay(int soTienVay);
}

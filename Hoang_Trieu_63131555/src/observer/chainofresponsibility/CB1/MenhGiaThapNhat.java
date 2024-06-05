package observer.chainofresponsibility.CB1;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhgia) {
        super(menhgia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m) {
        return null;
    }

    @Override
    public void rutTien(int sotien) {
        int soTo = sotien/menhgia;
        System.out.println(soTo + "tờ" + menhgia);
    }
}

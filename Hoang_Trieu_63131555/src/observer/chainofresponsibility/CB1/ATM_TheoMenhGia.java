package observer.chainofresponsibility.CB1;

public abstract class ATM_TheoMenhGia {
    int menhgia;

    public ATM_TheoMenhGia(int menhgia) {
        this.menhgia = menhgia;
    }

    abstract ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m);
    abstract void rutTien(int sotien);
}

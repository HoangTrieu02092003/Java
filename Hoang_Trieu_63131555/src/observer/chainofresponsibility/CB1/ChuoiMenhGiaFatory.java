package observer.chainofresponsibility.CB1;

public abstract class ChuoiMenhGiaFatory{
    abstract ATM_TheoMenhGia getChuoiMenhGia(int menhgia);
    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        if(chuoiMenhGia != null){
            chuoiMenhGia.rutTien(soTien);
        }
    }
}

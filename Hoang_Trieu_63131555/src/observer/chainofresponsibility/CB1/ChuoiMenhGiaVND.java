package observer.chainofresponsibility.CB1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFatory{
    ATM_TheoMenhGia atmTheoMenhGia500 = new MenhGia(500);
    ATM_TheoMenhGia atmTheoMenhGia200 = new MenhGia(200);
    ATM_TheoMenhGia atmTheoMenhGia100 = new MenhGia(100);
    ATM_TheoMenhGia atmTheoMenhGia50 = new MenhGia(50);
    ATM_TheoMenhGia atmTheoMenhGia20= new MenhGia(20);
    ATM_TheoMenhGia atmTheoMenhGia10= new MenhGia(10);
    ATM_TheoMenhGia atmTheoMenhGia5= new MenhGia(5);
    ATM_TheoMenhGia atmTheoMenhGia2= new MenhGia(2);
    ATM_TheoMenhGia atmTheoMenhGia1= new MenhGia(1);

    public ChuoiMenhGiaVND() {
        atmTheoMenhGia500.menhGiaTiepTheo(atmTheoMenhGia200).menhGiaTiepTheo(atmTheoMenhGia100).menhGiaTiepTheo(atmTheoMenhGia50).menhGiaTiepTheo(atmTheoMenhGia20).menhGiaTiepTheo(atmTheoMenhGia10).menhGiaTiepTheo(atmTheoMenhGia5).menhGiaTiepTheo(atmTheoMenhGia2).menhGiaTiepTheo(atmTheoMenhGia1);
    }

    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhgia) {
        switch (menhgia) {
            case 500:
                return atmTheoMenhGia500;
            case 200:
                return atmTheoMenhGia200;
            case 100:
                return atmTheoMenhGia100;
            case 50:
                return atmTheoMenhGia50;
            case 20:
                return atmTheoMenhGia20;
            case 10:
                return atmTheoMenhGia10;
            case 5:
                return atmTheoMenhGia5;
            case 2:
                return atmTheoMenhGia2;
            case 1:
                return atmTheoMenhGia1;
            default:
                return null;
        }
    }
}

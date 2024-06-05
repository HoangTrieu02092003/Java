package observer.chainofresponsibility.CB1;

public class MainCB1 {
    public static void main(String[] args) {
        ATM_TheoMenhGia atmTheoMenhGia500 = new MenhGia(500);
        ATM_TheoMenhGia atmTheoMenhGia200 = new MenhGia(200);
        ATM_TheoMenhGia atmTheoMenhGia100 = new MenhGia(100);
        ATM_TheoMenhGia atmTheoMenhGia50 = new MenhGia(50);
        ATM_TheoMenhGia atmTheoMenhGia20= new MenhGia(20);
        ATM_TheoMenhGia atmTheoMenhGia10= new MenhGia(10);
        ATM_TheoMenhGia atmTheoMenhGia5= new MenhGia(5);
        ATM_TheoMenhGia atmTheoMenhGia2= new MenhGia(2);
        ATM_TheoMenhGia atmTheoMenhGia1= new MenhGia(1);
        atmTheoMenhGia500.menhGiaTiepTheo(atmTheoMenhGia200).menhGiaTiepTheo(atmTheoMenhGia100).menhGiaTiepTheo(atmTheoMenhGia50).menhGiaTiepTheo(atmTheoMenhGia20);
        atmTheoMenhGia500.rutTien(750);
        System.out.println("=====================================");
        ChuoiMenhGiaFatory chuoiMenhGiaFactory = new ChuoiMenhGiaVND();
        chuoiMenhGiaFactory.rutTien(1200,200);
    }
}

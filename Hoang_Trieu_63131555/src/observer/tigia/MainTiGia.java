package observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        Tigia t = new TigiaUSD();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(t);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(t);
        nhaDauTuA.dangKy();
        nhaDauTuB.dangKy();
        System.out.println("Thong bao lan 1:");
        t.notify(-1);
        nhaDauTuA.huyDangKy();
        System.out.println("Thong bao lan 2:");
        t.notify(3);
    }
}

package observer.tigia;

public class NhaDauTuB implements Tigia.TigiaObserver{
    Tigia t;

    public NhaDauTuB(Tigia t) {
        this.t = t;
    }

    public void dangKy() {
        t.attach(this);
    }
    public void huyDangKy() {
        t.detach(this);
    }
    @Override
    public void tigiaChanged(double delta) {
        if (delta < 0) {
            System.out.println("Nha dau tu B: Ban ra");
        } else {
            System.out.println("Nha dau tu B: Mua vao");
        }
    }
}

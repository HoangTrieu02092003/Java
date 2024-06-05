package observer.tigia;

public class NhaDauTuA implements Tigia.TigiaObserver{
    Tigia t;

    public NhaDauTuA(Tigia t) {
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
            System.out.println("Nha dau tu A: Mua vao");
        } else {
            System.out.println("Nha dau tu A: Ban ra");
        }
    }
}

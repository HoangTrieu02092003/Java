package observer.CA6;

public class PlayerData implements PlayerDataListener {
    PlayerDataListener listener;
    int thoiGian, soLuotChoi, diemSo;

    public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
    }

    @Override
    public void listen(PlayerData playerData) {

    }

    void dangKy(PlayerDataListener listener) {
        this.listener = listener;
    }

    void huyDangKy(PlayerDataListener listener) {
        this.listener = null;
    }

    public PlayerDataListener getListener() {
        return listener;
    }

    public void setListener(PlayerDataListener listener) {
        this.listener = listener;
        listener.listen(this);
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        listener.listen(this);
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        listener.listen(this);
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
        listener.listen(this);
    }
}

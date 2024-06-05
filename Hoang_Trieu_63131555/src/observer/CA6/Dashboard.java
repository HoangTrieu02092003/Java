package observer.CA6;

public class Dashboard implements PlayerDataListener {
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
    }

    @Override
    public void listen(PlayerData playerData) {
        System.out.println("Thoi gian: " + playerData.getThoiGian());
        System.out.println("So luot choi: " + playerData.getSoLuotChoi());
        System.out.println("Diem so: " + playerData.getDiemSo());
    }
}

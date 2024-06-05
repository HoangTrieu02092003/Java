package observer.CA6;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(10, 2, 1000);
        Dashboard dashboard = new Dashboard(playerData);
        playerData.dangKy(dashboard);
        playerData.listener.listen(playerData);
        System.out.println("\nThay doi thoi gian");
        playerData.setThoiGian(20);
        System.out.println("\nThay doi so luot choi");
        playerData.setSoLuotChoi(10);
        System.out.println("\nThay doi diem so");
        playerData.setDiemSo(10);
    }
}

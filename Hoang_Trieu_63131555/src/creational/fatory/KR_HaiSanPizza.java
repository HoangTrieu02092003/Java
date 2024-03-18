package creational.fatory;

public class KR_HaiSanPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị bột gạo và 4 miếng kim chi");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than 15 phút");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Gói giấy bạc");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Cắt thành 4 miếng")
                .append("\n")
                .append("Chức bạn ngon miệng! Hẹn gặp lại");
    }
}

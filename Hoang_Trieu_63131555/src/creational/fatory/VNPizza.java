package creational.fatory;

public class VNPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị bột gạo và 4 con cá cơm");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than 15 phút");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Gói lá chuối");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Cắt thành 4 miếng")
                .append("\n")
                .append("Chức bạn ngon miệng! Hẹn gặp lại");
    }
}

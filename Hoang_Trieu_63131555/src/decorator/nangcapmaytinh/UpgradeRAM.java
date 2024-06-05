package decorator.nangcapmaytinh;

public class UpgradeRAM extends ComputerDecorator{
    String addRAM;
    int vAddRAM;

    public UpgradeRAM(Computer computer, String addRAM, int vAddRAM) {
        super(computer);
        this.addRAM = addRAM;
        this.vAddRAM = vAddRAM;
    }

    public UpgradeRAM(Computer computer) {
        super(computer);
    }

    @Override
    String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(computer.build()).append("Add RAM: ").append(addRAM).append(':').append(vAddRAM);
        return sb.toString();
    }

    @Override
    int value() {
        return computer.value() + vAddRAM;
    }

    public int getvRAM() {
        return computer.getvRAM() + vAddRAM;
    }
}

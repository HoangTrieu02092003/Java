package decorator.nangcapmaytinh;

public class UpgradeCPU extends ComputerDecorator{
    String replaceCPU;
    int vReplaceCPU;

    public UpgradeCPU(Computer computer, String addCPU, int vAddCPU) {
        super(computer);
        this.replaceCPU = addCPU;
        this.vReplaceCPU = vAddCPU;
    }

    public UpgradeCPU(Computer computer) {
        super(computer);
    }

    @Override
    String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(computer.build()).append("Add CPU: ").append(replaceCPU).append(':').append(vReplaceCPU);
        return sb.toString();
    }

    @Override
    int value() {
        return computer.value() - computer.getvCPU() + vReplaceCPU;
    }

    public int getvCPU() {
        return vReplaceCPU;
    }
}

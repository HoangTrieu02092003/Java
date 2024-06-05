package decorator.nangcapmaytinh;

public class BasicComputer extends Computer {
    public BasicComputer(String mainboard, String CPU, String RAM, String storage, String screen, int vMainboard, int vCPU, int vRAM, int vStorage, int vScreen) {
        Mainboard = mainboard;
        this.CPU = CPU;
        this.RAM = RAM;
        Storage = storage;
        Screen = screen;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vRAM = vRAM;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    String build() {
//        return "BasicComputer" + '\'' +
//                "Mainboard: " + Mainboard + ':' + vMainboard + '\'' +
//                ", CPU: " + CPU + ':' + vCPU + '\'' +
//                ", RAM: " + RAM + ':' + vRAM + '\'' +
//                ", Storage: " + Storage + ':' + vStorage + '\'' +
//                ", Screen: " + Screen + ':' +  vScreen + '\'';
        StringBuilder sb = new StringBuilder();
        return sb.append("Mainboard: ").append(Mainboard).append(':').append(vMainboard).append("\n")
                .append(" CPU: ").append(CPU).append(':').append(vCPU).append("\n")
                .append(" RAM: ").append(RAM).append(':').append(vRAM).append("\n")
                .append(" Storage: ").append(Storage).append(':').append(vStorage).append("\n")
                .append(" Screen: ").append(Screen).append(':').append(vScreen).append("\n")
                .toString();
    }

    @Override
    int value() {
        return vMainboard + vCPU + vRAM + vStorage + vScreen;
    }
}

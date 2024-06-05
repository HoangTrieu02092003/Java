package decorator.nangcapmaytinh;

public abstract class Computer {
    String Mainboard, CPU, RAM, Storage, Screen;
    int vMainboard, vCPU, vRAM, vStorage, vScreen;

    abstract String build();
    abstract int value();

    public String getMainboard() {
        return Mainboard;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public String getScreen() {
        return Screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getvRAM() {
        return vRAM;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}

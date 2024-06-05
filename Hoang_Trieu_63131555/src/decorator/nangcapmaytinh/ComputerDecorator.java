package decorator.nangcapmaytinh;

public class ComputerDecorator extends Computer{
    Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    String build() {
        return null;
    }

    @Override
    int value() {
        return computer.vMainboard + computer.vCPU + computer.vRAM + computer.vStorage + computer.vScreen;
    }

}

package builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("R5 5600H")
                .addRAM("8G Kingston")
                .addStorage("512GB")
                .addScreen("15.6 inch")
                .build();
        System.out.println(computer.toString());
    }
}

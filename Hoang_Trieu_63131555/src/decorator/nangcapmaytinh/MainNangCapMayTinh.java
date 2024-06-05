package decorator.nangcapmaytinh;

public class MainNangCapMayTinh {
    public static void main(String[] args) {
        Computer basicComputer = new BasicComputer("Asus", "Intel Core i5", "8GB", "256GB SSD", "15.6 inch", 1000, 500, 200, 300, 100);
        System.out.println(basicComputer.build());
        System.out.println("Value: " + basicComputer.value());
        System.out.println("\n");

        UpgradeRAM upgradeRAM = new UpgradeRAM(basicComputer, "16GB", 500);
        System.out.println(upgradeRAM.build());
        System.out.println("Value: " + upgradeRAM.value());
        System.out.println("Value of RAM: " + upgradeRAM.getvRAM());

        System.out.println("\n");
        UpgradeCPU upgradeCPU = new UpgradeCPU(basicComputer, "Intel Core i7", 1000);
        System.out.println(upgradeCPU.build());
        System.out.println("Value: " + upgradeCPU.value());
        System.out.println("Value of CPU: " + upgradeCPU.getvCPU());
    }
}

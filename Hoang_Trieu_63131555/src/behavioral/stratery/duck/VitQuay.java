package behavioral.stratery.duck;

public class VitQuay extends Duck{
    @Override
    public void display() {
        System.out.println("Tôi là vịt quay");
        swim();
        performQuack();
        performFly();
    }
}

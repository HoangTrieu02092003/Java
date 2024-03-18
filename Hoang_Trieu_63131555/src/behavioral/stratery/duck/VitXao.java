package behavioral.stratery.duck;

public class VitXao extends Duck{
    @Override
    public void display() {
        System.out.println("Tôi là vịt xào");
        swim();
        performQuack();
        performFly();
    }
}

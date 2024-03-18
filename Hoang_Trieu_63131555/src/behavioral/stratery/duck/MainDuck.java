package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck1 = new VitQuay();
        duck1.setFlyBehavior(new BayTrenLoThan());
        duck1.setQuackBehavior(new VitQuayKeu());
        duck1.display();
        Duck duck2 = new VitXao();
        duck2.setFlyBehavior(new BayTrenChao());
        duck2.setQuackBehavior(new VitXaoKeu());
        duck2.display();
    }
}

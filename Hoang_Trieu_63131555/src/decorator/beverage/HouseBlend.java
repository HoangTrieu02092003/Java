package decorator.beverage;

public class HouseBlend extends Bevarage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 10;
    }
}

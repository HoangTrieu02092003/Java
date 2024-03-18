package decorator.beverage;

public abstract class Bevarage {
    String description;

    public Bevarage(String description) {
        this.description = description;
    }

    public abstract int cost();

    public String getDescription() {
        return description;
    }
}

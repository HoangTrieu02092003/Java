package structural.composite.B6;

public abstract class BNode {

    protected String p;
    int value;

    public BNode(int value) {
        this.value = value;
    }

    public abstract void addL(BNode node);
    public abstract void removeL(BNode node);
    public abstract void addR(BNode node);
    public abstract void removeR(BNode node);
    public abstract String duyet();
}

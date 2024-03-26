package structural.composite.B6;

public class InnerNode extends BNode{
    BNode left;
    BNode right;

    String p;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {
        left = node;
    }

    @Override
    public void removeL(BNode node) {
        left = null;
    }

    @Override
    public void addR(BNode node) {
        right = node;
    }

    @Override
    public void removeR(BNode node) {
        right = null;
    }

    @Override
    public String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        left.p = this.p + "\t";
        if (left != null) {
            builder.append("\n").append(left.p).append(left.duyet());
            left.p = "";
        }
        if (right != null) {
            builder.append("\n").append(left.p).append(right.duyet());
        }

        return builder.toString();
    }
}

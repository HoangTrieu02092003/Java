package structural.composite.B6;

public class MainB6 {
    public static void main(String[] args) {
        BNode root = new InnerNode(1);
        BNode left = new InnerNode(2);
        BNode right = new InnerNode(3);
        BNode leftLeft = new Leaft(4);
        BNode leftRight = new Leaft(5);
        BNode rightLeft = new Leaft(6);
        BNode rightRight = new Leaft(7);

        root.addL(left);
        root.addR(right);
        left.addL(leftLeft);
        left.addR(leftRight);
        right.addL(rightLeft);
        right.addR(rightRight);

        System.out.println(root.duyet());
    }
}

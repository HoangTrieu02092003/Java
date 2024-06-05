package structural.decorater.B2;

public class MainB2 {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ!!!";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopword(t);
        System.out.println(t.tokenize());
        t = new RemovePunc(t);
        System.out.println(t.tokenize());
    }
}

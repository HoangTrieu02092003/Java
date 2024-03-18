package stratery.CC1;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        //c.setTinh(new Cong()).tinh(3,5);
        float tg1 = c.setTinh(new Cong()).tinh(3,5);
        float tg2 = c.setTinh(new Nhan()).tinh(tg1,7);
        System.out.println(tg2);
        System.out.println(c.setTinh(new Cong()).tinh(4,2));
        System.out.println(c.setTinh(new Tru()).tinh(4,2));
        System.out.println(c.setTinh(new Nhan()).tinh(4,2));
        System.out.println(c.setTinh(new Chia()).tinh(4,2));
    }
}

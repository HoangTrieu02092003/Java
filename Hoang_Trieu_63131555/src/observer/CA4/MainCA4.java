package observer.CA4;

import java.util.List;


public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA thanhVienA = new ThanhVienA(topic);
        ThanhVienB thanhVienB = new ThanhVienB(topic);

        TinTuc tinTuc1 = new TinTuc("Hom nay troi nong qua", "Tin 1");
        TinTuc tinTuc2 = new TinTuc("Hom nay troi mat qua", "Tin 2");

        topic.themMoi(tinTuc1);
        topic.themMoi(tinTuc2);

    }
}

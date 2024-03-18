package behavioral.template_method;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Cho bột coffee vào phin và cho thêm nước sôi");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm sữa ông Thọ");
    }
}

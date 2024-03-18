package behavioral.template_method;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Cho trà vào cốc và cho thêm nước sôi");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm đá");
    }
}

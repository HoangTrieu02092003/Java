package behavioral.template_method;

public class MainTemplateMethod {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}

package behavioral.template_method;

public abstract class CaffeineBeverage {
    abstract void brew();
    abstract void addCondiments();
    private void boilWater(){
        System.out.println("Đun sôi nước đến 100 độ C");
    };
    private void pourInCup(){
        System.out.println("Rót ra cốc");
    };
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    };
}

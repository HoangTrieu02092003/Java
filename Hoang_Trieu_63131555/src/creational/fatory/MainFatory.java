package creational.fatory;

public class MainFatory {
    public static void main(String[] args) {
        PizzaStore vnPizzaStore = new VNPizzaStore();
        Pizza p = vnPizzaStore.orderPizza(PizzaType.HAI_SAN);
        System.out.println(p.toString());
        PizzaStore krPizzaStore = new KRPizzaStore();
        Pizza kr = krPizzaStore.orderPizza(PizzaType.HAI_SAN);
        System.out.println(kr.toString());
    }
}
package creational.fatory;

public class KRPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        Pizza p;
        switch (pizzaType){
            case HAI_SAN -> {
                return new KR_HaiSanPizza();
            }
        }
        return null;
    }
}

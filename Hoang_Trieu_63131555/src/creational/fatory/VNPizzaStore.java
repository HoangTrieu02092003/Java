package creational.fatory;

import java.lang.runtime.SwitchBootstraps;

public class VNPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        Pizza p;
        switch (pizzaType){
            case HAI_SAN -> {
                return new VNPizza();
            }
        }
        return null;
    }
}

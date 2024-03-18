package creational.fatory;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType pizzaType);
    Pizza orderPizza(PizzaType pizzaType){
        Pizza p = createPizza(pizzaType );
        p.prepare();
        p.bake();
        p.box();
        p.cut();
        return p;
    };
}

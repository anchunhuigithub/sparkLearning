package headup.design2.store;

import headup.design2.pizza.ChicagoStyleCheesePizza;
import headup.design2.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}

package headup.design2.store;

import headup.design2.pizza.NYStyleCheesePizza;
import headup.design2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}

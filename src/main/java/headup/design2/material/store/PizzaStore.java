package headup.design2.material.store;

import headup.design2.material.pizza.Pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type);
}

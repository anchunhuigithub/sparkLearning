package headup.design2.material.store;

import headup.design2.material.factory.NYPizzaIngredientFactory;
import headup.design2.material.pizza.CheesePizza;
import headup.design2.material.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza=null;
        NYPizzaIngredientFactory nyPizzaIngredientFactory=new NYPizzaIngredientFactory();
        if("cheese".equals(type)){
            pizza=new CheesePizza(nyPizzaIngredientFactory);
        }else if("clam".equals(type)){

        }
        return pizza;
    }
}

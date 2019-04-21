package headup.design2.material.factory;

import headup.design2.material.cheese.Cheese;
import headup.design2.material.clams.Clams;
import headup.design2.material.dough.Dough;
import headup.design2.material.pepperoni.Pepperoni;
import headup.design2.material.sauce.Sauce;
import headup.design2.material.veggies.Veggies;

/**
 * 原料加工工厂接口
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}

package headup.design2.material.factory;

import headup.design2.material.cheese.Cheese;
import headup.design2.material.cheese.ReggianoCheese;
import headup.design2.material.clams.Clams;
import headup.design2.material.clams.FreshClams;
import headup.design2.material.dough.Dough;
import headup.design2.material.dough.ThinCrustDough;
import headup.design2.material.pepperoni.Pepperoni;
import headup.design2.material.pepperoni.SlicePepperoni;
import headup.design2.material.sauce.MarinaraSauce;
import headup.design2.material.sauce.Sauce;
import headup.design2.material.veggies.*;

/**
 * 创建纽约的原料交工工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[]={new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}

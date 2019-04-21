package headup.design2.material.pizza;

import headup.design2.material.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    void prepare() {
        this.cheese=pizzaIngredientFactory.createCheese();
        this.clams=pizzaIngredientFactory.createClams();
        this.douth=pizzaIngredientFactory.createDough();
        this.pepperoni=pizzaIngredientFactory.createPepperoni();
        this.sauce=pizzaIngredientFactory.createSauce();
        this.veggies=pizzaIngredientFactory.createVeggies();
    }
}

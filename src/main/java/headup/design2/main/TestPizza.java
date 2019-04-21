package headup.design2.main;

import headup.design2.pizza.Pizza;
import headup.design2.store.ChicagoPizzaStore;
import headup.design2.store.NYPizzaStore;
import headup.design2.store.PizzaStore;

public class TestPizza {

    public static void main(String[] args) {
        PizzaStore pizzaStore=new NYPizzaStore();
        PizzaStore pizzaStore1=new ChicagoPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("order a "+pizza.getName());

        Pizza pizza1 = pizzaStore1.orderPizza("cheese");
        System.out.println("order a"+pizza1.getName());
    }
}

package headup.design2.pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

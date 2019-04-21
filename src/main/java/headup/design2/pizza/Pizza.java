package headup.design2.pizza;

import java.util.ArrayList;

public abstract class Pizza {

    private String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();

    public void prepare(){
        System.out.println("Prepare "+name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("   "+toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes as 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

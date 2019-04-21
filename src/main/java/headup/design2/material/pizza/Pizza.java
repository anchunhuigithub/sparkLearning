package headup.design2.material.pizza;

import headup.design2.material.cheese.Cheese;
import headup.design2.material.clams.Clams;
import headup.design2.material.dough.Dough;
import headup.design2.material.pepperoni.Pepperoni;
import headup.design2.material.sauce.Sauce;
import headup.design2.material.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough douth;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    abstract void prepare();

    void bake(){
        System.out.println("");
    }
    void cut(){
        System.out.println("");
    }
    void box(){
        System.out.println("");
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", douth=" + douth +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}

package headup.design0.entity;


import headup.design0.impl.FlyWithWings;
import headup.design0.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

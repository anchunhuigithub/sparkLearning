package headup.design0.main;

import headup.design0.entity.Duck;
import headup.design0.entity.MallardDuck;
import headup.design0.impl.FlyNoWay;
import headup.design0.impl.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck= new MallardDuck();
        duck.perforFly();
        duck.perforQuack();
        duck.display();

        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.perforQuack();
        duck.perforFly();
    }
}

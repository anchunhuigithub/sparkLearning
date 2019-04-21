package headup.design0.impl;

import headup.design0.inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I cant`t fly ");
    }
}

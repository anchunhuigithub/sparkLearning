package headup.design0.impl;

import headup.design0.inter.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}

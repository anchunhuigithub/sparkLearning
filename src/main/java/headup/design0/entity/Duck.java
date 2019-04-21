package headup.design0.entity;

import headup.design0.inter.FlyBehavior;
import headup.design0.inter.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public abstract void display();

    public void perforFly(){
        flyBehavior.fly();
    }
    public void perforQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float ,even deoys");
    }

    // 动态指定运行时动作
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

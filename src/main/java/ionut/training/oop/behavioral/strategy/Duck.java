package ionut.training.oop.behavioral.strategy;

import ionut.training.oop.behavioral.strategy.fly.FlyBehaviour;
import ionut.training.oop.behavioral.strategy.quack.QuackBehaviour;

public abstract class Duck {
    protected FlyBehaviour fly;
    protected QuackBehaviour quack;

    public Duck(FlyBehaviour fly, QuackBehaviour quack) {
        this.fly = fly;
        this.quack = quack;
    }

    abstract void display();

    public void quack() {
        quack.quack();
    }

    public void fly() {
        fly.takeOff();
    }
}
